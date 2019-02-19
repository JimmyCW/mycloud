package com.wx.microserviceribbon.service;

import com.wx.microserviceribbon.pojo.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "micro-provider/product")
public interface FeignService {

    @GetMapping("getByName")
    Product getByProductName(@RequestParam(name = "productName", required = true) String productName);
}
