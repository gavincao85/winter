package com.winter.orderservice.service;

import com.winter.orderservice.domain.Commodity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * ICommodityService
 *
 * @author Gavin
 * @date 2019/1/11 15:37
 */
public interface ICommodityService {

    @GetMapping("/get")
    List<Commodity> getCommodityByIds(@RequestParam(value = "codes") String[] commodityCodes);
}
