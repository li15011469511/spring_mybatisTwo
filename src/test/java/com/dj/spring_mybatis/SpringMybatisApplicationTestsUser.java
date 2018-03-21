package com.dj.spring_mybatis;

import com.dj.spring_mybatis.domain.User;
import com.dj.spring_mybatis.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringMybatisApplicationTestsUser {

	//注入用户业务层
	@Autowired
	private UserService userService;


	/**
	 * 查询用户
	 */
	@Test
	public void readUser(){
		List<User> list = userService.readUser();
		for (User user: list) {
			System.out.println(user.getId() + "=============" + user.getUsername());
		}
	}


	/**
	 * 增加用户
	 */
	@Test
	public void addUser(){
		User user = new User();
		user.setUsername("ww");
		userService.addUser(user);
	}

	/**
	 * 修改用户
	 */
	@Test
	public void updateUser(){
		User user = userService.getUserById(1);
		User user1 = new User();
		user1.setId(2);
		user1.setUsername(user.getUsername());
		userService.updateUser(user1);
	}

	/**
	 * 删除用户
	 */
	@Test
	public void delUser(){
		userService.delUserById(1);
	}

}
