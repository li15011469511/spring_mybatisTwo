package com.dj.spring_mybatis.controller;

import com.dj.spring_mybatis.domain.Order;
import com.dj.spring_mybatis.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RequestMapping("order")
public class OrderController {

    @Autowired
    private OrderService orderService;


    @RequestMapping("readOrder")
    public String readUser(Model model){
        List<Order> list = orderService.readOrder();
        model.addAttribute("order",list);
        return "order";
    }

}
