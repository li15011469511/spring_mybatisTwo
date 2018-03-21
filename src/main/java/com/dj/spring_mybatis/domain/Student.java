package com.dj.spring_mybatis.domain;

/**
 * 学生实体类
 */
public class Student {

    //学生编号
    private Integer id;

    //学生姓名
    private String name;


    /**
     * ============get/set===========
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
