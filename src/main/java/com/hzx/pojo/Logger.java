package com.hzx.pojo;

import org.springframework.stereotype.Component;

@Component
public class Logger {

    /**
     * 日志表:id\operate_goods_id\operate_type(通过aop传参插入此字段)\operate_time
     */

    private Integer id;
    private Integer operateGoodsId;
    private String operateType;//(通过aop传参插入此字段，增删改查)
    private String operateTime;


    public Logger() {
    }

    public Logger(Integer id, Integer operateGoodsId, String operateType, String operateTime) {
        this.id = id;
        this.operateGoodsId = operateGoodsId;
        this.operateType = operateType;
        this.operateTime = operateTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOperateGoodsId() {
        return operateGoodsId;
    }

    public void setOperateGoodsId(Integer operateGoodsId) {
        this.operateGoodsId = operateGoodsId;
    }

    public String getOperateType() {
        return operateType;
    }

    public void setOperateType(String operateType) {
        this.operateType = operateType;
    }

    public String getOperateTime() {
        return operateTime;
    }

    public void setOperateTime(String operateTime) {
        this.operateTime = operateTime;
    }

    @Override
    public String toString() {
        return "Logger{" +
                "id=" + id +
                ", operateGoodsId=" + operateGoodsId +
                ", operateType='" + operateType + '\'' +
                ", operateTime='" + operateTime + '\'' +
                '}';
    }
}
