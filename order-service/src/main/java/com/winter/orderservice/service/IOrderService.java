package com.winter.orderservice.service;

import com.winter.orderservice.domain.Order;

/**
 * IOrderService
 *
 * @author Gavin
 * @date 2019/1/14 14:09
 */
public interface IOrderService {
    Order getOrderByCode(String orderCode);
}
