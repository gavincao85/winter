package com.winter.commodity.controller;

import com.winter.commodity.domain.Commodity;
import com.winter.commodity.service.ICommodityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Commodity
 *
 * @author Gavin
 * @date 2019/1/11 15:20
 */
@RestController
@RequestMapping("/commodity")
public class CommodityController {

    @Autowired
    private ICommodityService commodityService;

    @GetMapping("/get")
    public List<Commodity> getCommodity(@RequestParam(value = "codes") String[] codes) {
        return commodityService.getCommodityByIds(codes);
    }
}


