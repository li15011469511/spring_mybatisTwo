package com.dj.spring_mybatis.service.impl;

import com.dj.spring_mybatis.domain.Order;
import com.dj.spring_mybatis.mapper.OrderMapper;
import com.dj.spring_mybatis.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OrderServiceImpl implements OrderService{

    @Autowired
    private OrderMapper orderMapper;

    @Override
    public List<Order> readOrder() {
        return orderMapper.readOrder();
    }
}
