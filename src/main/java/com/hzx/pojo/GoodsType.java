package com.hzx.pojo;

import org.springframework.stereotype.Component;

@Component
public class GoodsType {

    /**
     * 商品类型表:id\type_name
     */

    private Integer id;
    private String typeName;

    public GoodsType() {
    }

    public GoodsType(Integer id, String typeName) {
        this.id = id;
        this.typeName = typeName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    @Override
    public String toString() {
        return "GoodsType{" +
                "id=" + id +
                ", typeName='" + typeName + '\'' +
                '}';
    }
}
