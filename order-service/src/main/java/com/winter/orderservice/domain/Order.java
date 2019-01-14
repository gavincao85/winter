package com.winter.orderservice.domain;

import java.util.List;

/**
 * Order
 *
 * @author Gavin
 * @date 2019/1/14 14:07
 */
public class Order {

    private Long id;
    private  String orderCode;
    private List<Commodity> commodities;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    public List<Commodity> getCommodities() {
        return commodities;
    }

    public void setCommodities(List<Commodity> commodities) {
        this.commodities = commodities;
    }

}
