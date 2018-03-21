package com.dj.spring_mybatis.mapper;

import com.dj.spring_mybatis.domain.Order;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface OrderMapper {


    @Select("SELECT * FROM dj_order")
    public List<Order> readOrder();

}
