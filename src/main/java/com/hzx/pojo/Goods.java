package com.hzx.pojo;

import org.springframework.stereotype.Component;

@Component
public class Goods {

    /**
     * 商品表:id\goods_name\goods_type_id\price
     */


    private Integer id;
    private String goodsName;
    private Integer goodsTypeId;
    private Integer price;
    private GoodsType goodsType;

    public Goods() {
    }

    public Goods(Integer id, String goodsName, Integer goodsTypeId, Integer price) {
        this.id = id;
        this.goodsName = goodsName;
        this.goodsTypeId = goodsTypeId;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public Integer getGoodsTypeId() {
        return goodsTypeId;
    }

    public void setGoodsTypeId(Integer goodsTypeId) {
        this.goodsTypeId = goodsTypeId;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public GoodsType getGoodsType() {
        return goodsType;
    }

    public void setGoodsType(GoodsType goodsType) {
        this.goodsType = goodsType;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "id=" + id +
                ", goodsName='" + goodsName + '\'' +
                ", goodsTypeId=" + goodsTypeId +
                ", price=" + price +
                ", goodsType=" + goodsType +
                '}';
    }
}
