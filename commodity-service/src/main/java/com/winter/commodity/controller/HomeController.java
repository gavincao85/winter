package com.winter.commodity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class HomeController {

    @GetMapping()
    public  String home() {
        return "commodity-service" + "\t" + new Date();
    }

}
