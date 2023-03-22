package com.hzx.mapper;

import com.hzx.pojo.Goods;

import java.util.List;

public interface GoodsMapper {

    int insertGoods(Goods goods);
    int deleteGoodsById(Goods goods);
    int updateGoods(Goods goods);
    Goods selectGoodsAndType(Integer id);
    List<Goods> selectAll();


}
