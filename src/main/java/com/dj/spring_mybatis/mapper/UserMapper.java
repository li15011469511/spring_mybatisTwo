package com.dj.spring_mybatis.mapper;

import com.dj.spring_mybatis.domain.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * 用户持久层接口（注解式）
 */
public interface UserMapper {


    /**
     * 查询用户
     * @return
     */
    @Select("SELECT * FROM user")
    public List<User> readUser();

    /**
     * 增加用户
     * @param user
     */
    @Insert("INSERT INTO user(username) VALUES (#{username})")
    public void addUser(User user);

    /**
     * 获取待修改的用户信息
     * @param id
     * @return
     */
    @Select("SELECT * FROM user WHERE id = #{id}")
    public User getUserById(Integer id);

    /**
     * 修改用户
     * @param user
     */
    @Update("UPDATE user SET username = #{username} WHERE id = #{id}")
    public void updateUser(User user);

    /**
     * 删除用户
     * @param id
     */
    @Delete("DELETE FROM user WHERE id = #{id}")
    public void delUserById(Integer id);
}
