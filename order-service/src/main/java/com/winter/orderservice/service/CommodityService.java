package com.winter.orderservice.service;

import com.winter.orderservice.domain.Commodity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * ICommodityService
 *
 * @author Gavin
 * @date 2019/1/11 15:37
 */
@Service
public class CommodityService {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/get")
    public List<Commodity> getCommodity(@RequestParam(value = "codes") String[] commodityCodes) {
        List<Commodity> commodityList = restTemplate.getForObject("http://commodity-service/commodity/get?codes=C01,C02", List.class, commodityCodes);
        return commodityList;
    }

}
