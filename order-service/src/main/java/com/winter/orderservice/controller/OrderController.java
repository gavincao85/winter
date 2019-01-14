package com.winter.orderservice.controller;

import com.winter.orderservice.domain.Order;
import com.winter.orderservice.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * OrderController
 *
 * @author Gavin
 * @date 2019/1/14 14:08
 */
@RestController
@RequestMapping("order")
public class OrderController {

    @Autowired
    IOrderService orderService;

    @GetMapping("/get/{ordercode}")
    public Order getOrderByCode(@PathVariable(value = "ordercode") String orderCode) {
        return orderService.getOrderByCode(orderCode);
    }
}
