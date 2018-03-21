package com.dj.spring_mybatis.controller;

import com.dj.spring_mybatis.domain.User;
import com.dj.spring_mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;


    @RequestMapping("readUser")
    public List<User> readUser(){
        List<User> list = userService.readUser();
        return list;
    }


    @RequestMapping("addUser")
    public boolean addUser(User user){
        try {
            userService.addUser(user);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    @RequestMapping("delUser")
    public boolean delUser(Integer id){
        try {
            userService.delUserById(id);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
    }
    }

    @RequestMapping("updateUser")
    public boolean updateUser(User user){
        try {
            userService.updateUser(user);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }


    @RequestMapping("getUserById")
    public User getUserById(Integer id){
        User user = userService.getUserById(id);
        return user;
    }


    @RequestMapping("test")
    public User test(@RequestBody User user){
        return user;
    }





}
