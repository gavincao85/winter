package com.winter.commodity.controller;

import com.winter.commodity.domain.Commodity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/commodity")
public class CommodityController {

    @GetMapping("/get/{code}")
    public Commodity getCommodity(@PathVariable String code) {
        Commodity commodity= new Commodity(1L,"C01","手机",5.5);

        return  commodity;
    }
}

