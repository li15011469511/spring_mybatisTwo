package com.dj.spring_mybatis.domain;

public class Product {

    //商品编号
    private Integer id;

    //商品名
    private String name;


    /**
     * ===========get/set===========
     *
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
