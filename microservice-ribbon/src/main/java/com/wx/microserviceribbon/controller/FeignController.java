package com.wx.microserviceribbon.controller;


import com.wx.microserviceribbon.pojo.Product;
import com.wx.microserviceribbon.service.FeignService;
import com.wx.microserviceribbon.service.RibbonService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/feignTest")
@Slf4j
public class FeignController {

    @Autowired
    FeignService feignService;

    @Autowired
    RibbonService ribbonService;

    final static String RIBBON = "1";

    final static String FEIGN = "2";

    @GetMapping(value = "getProduct")
    public Product getProduct(@RequestParam String name, @RequestParam String type) {
        Product product;
        if(RIBBON.endsWith(type)) {
            product = ribbonService.getByName(name);
        } else {
            product = feignService.getByProductName(name);
        }
        log.info("product:{}", product);
        return product;
    }
}
