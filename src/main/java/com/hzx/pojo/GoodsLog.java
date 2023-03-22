package com.hzx.pojo;

import com.hzx.mapper.GoodsMapper;
import com.hzx.mapper.LoggerMapper;
import com.hzx.service.GoodsServiceImpl;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Aspect
@Component("goodsLog")
public class GoodsLog {

    @Autowired
    LoggerMapper loggerMapper;
    @Autowired
    GoodsMapper goodsMapper;

    @AfterReturning("execution(* com.hzx.service.GoodsServiceImpl.*(..))")
    public void selectAll(JoinPoint joinPoint){
        Signature signature = joinPoint.getSignature();
//        System.out.println("DeclaringType："+signature.getDeclaringType()+
//                "，DeclaringTypeName："+signature.getDeclaringTypeName()+
//                "，Name："+signature.getName()+
//                "，Modifiers："+signature.getModifiers());
        Goods goods = (Goods) joinPoint.getArgs()[0];
        loggerMapper.addLog(new Logger(null,goods.getId(),signature.getName(),null));
        System.out.println("执行了"+signature.getName()+"方法");
//        JoinPoint.StaticPart staticPart = joinPoint.getStaticPart();
//        System.out.println("id："+staticPart.getId()+
//                "，Kind："+staticPart.getKind());

    }

}
