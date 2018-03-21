package com.dj.spring_mybatis.service;

import com.dj.spring_mybatis.domain.User;

import java.util.List;

/**
 * 用户业务层接口
 */
public interface UserService {

    /**
     * 查询用户
     */
    public List<User> readUser();


    /**
     * 增加用户
     */
    public void addUser(User user);

    /**
     * 获取待修改的用户信息
     */
    public User getUserById(Integer id);


    /**
     * 修改用户
     */
    public void updateUser(User user);

    /**
     * 删除用户
     */

    public void delUserById(Integer id);

}
