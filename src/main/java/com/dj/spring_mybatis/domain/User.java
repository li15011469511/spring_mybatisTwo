package com.dj.spring_mybatis.domain;

import org.omg.PortableInterceptor.INACTIVE;

/**
 * 用户实体类
 */
public class User {

    //用户编号
    private Integer id;

    //用户名
    private String username;


    /**
     * =================get/set===============
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
