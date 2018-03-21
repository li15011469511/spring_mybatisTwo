package com.dj.spring_mybatis.service.impl;

import com.dj.spring_mybatis.domain.User;
import com.dj.spring_mybatis.mapper.UserMapper;
import com.dj.spring_mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 用户业务层接口的实现
 */
@Service
public class UserServiceImpl implements UserService{

    //注入用户持久层
    @Autowired
    private UserMapper userMapper;


    /**
     * 查询用户
     * @return
     */
    @Override
    public List<User> readUser() {
        return userMapper.readUser();
    }

    /**
     * 增加用户
     * @param user
     */
    @Override
    public void addUser(User user) {
        userMapper.addUser(user);
    }


    /**
     * 获取待修改的用户信息
     * @param id
     * @return
     */
    @Override
    public User getUserById(Integer id) {
        return userMapper.getUserById(id);
    }

    /**
     * 删除用户
     * @param id
     */
    @Override
    public void delUserById(Integer id) {
        userMapper.delUserById(id);
    }

    /**
     * 修改用户
     * @param user
     */
    @Override
    public void updateUser(User user) {
        userMapper.updateUser(user);
    }
}
