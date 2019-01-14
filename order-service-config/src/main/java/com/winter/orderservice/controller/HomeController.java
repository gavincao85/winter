package com.winter.orderservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
/**
 * Order
 *
 * @author Gavin
 * @date 2019/1/14 14:07
 */
@RestController
public class HomeController {

    @GetMapping()
    public  String home() {
        return "order-service-config" + "\t" + new Date();
    }

}
