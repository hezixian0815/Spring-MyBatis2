package com.hzx.service;

import com.hzx.pojo.Goods;

import java.util.List;

public interface GoodsService {

    int addGoods(Goods goods);
    int deleteGoodsById(Goods goods);
    int updateGoods(Goods goods);



}
