package com.dj.spring_mybatis.service;

import com.dj.spring_mybatis.domain.Student;

import java.util.List;

/**
 * 学生业务层接口
 */
public interface StudentService {

    /**
     * 查询学生
     */
    public List<Student> readStudent();


    /**
     * 增加学生
     */
    public void addStudent(Student student);


    /**
     * 删除学生
     */
    public void delStudent(Integer id);


    /**
     * 修改学生
     */
    public void updateStudent(Student student);

}
