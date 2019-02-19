package com.wx.selfservice.controller;

import com.wx.microserviceribbon.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/myInfo")
public class MyInfoController {

    @Value("${spring.application.name}")
    private String name;

    @Autowired
    FeignService feignService;

    @GetMapping("/product")
    public Object product(@RequestParam String productName) {
        return feignService.getByProductName(productName);
    }

    @GetMapping("/info")
    public String getInfo() {
        return name;
    }

}
