package com.winter.orderservice.controller;

import com.winter.orderservice.domain.Commodity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;


@RestController
@RequestMapping("/commodity")
public class CommodityController {
    @Autowired
    private  RestTemplate restTemplate;

    @GetMapping("/get")
    public List<Commodity> getCommodity(@RequestParam(value = "codes") String[] commodityCodes) {
        List<Commodity> commodityList = restTemplate.getForObject("http://commodity-service/commodity/get?codes=C01,C02", List.class, commodityCodes);
        return commodityList;
    }
}


