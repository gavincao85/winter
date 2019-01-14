package com.winter.orderservice.service.impl;

import com.netflix.discovery.converters.Auto;
import com.winter.orderservice.domain.Commodity;
import com.winter.orderservice.domain.Order;
import com.winter.orderservice.service.CommodityService;
import com.winter.orderservice.service.ICommodityService;
import com.winter.orderservice.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

/**
 * OrderServiceImpl
 *
 * @author Gavin
 * @date 2019/1/14 14:15
 */
@Service
public class OrderServiceImpl implements IOrderService {

    @Autowired
    CommodityService commodityService;

    @Override
    public Order getOrderByCode(String orderCode) {
        Order order = new Order();
        order.setId(101L);
        order.setOrderCode("S101");
        ArrayList<String> codes = new ArrayList<>();
        codes.add("C100");
        codes.add("C101");
        codes.add("C102");
        codes.add("C103");
        List<Commodity> commodities = commodityService.getCommodity(codes.toArray(new String[codes.size()]));
        if (commodities != null) {
            order.setCommodities(commodities);
        }
        return order;
    }
}
