package com.wx.microserviceprovider.controller;

import com.alibaba.fastjson.JSONObject;
import com.wx.microserviceprovider.dao.ProductDao;
import com.wx.microserviceprovider.entity.Product;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/product")
@Slf4j
public class ProductController {

    @Autowired
    ProductDao productDao;

    @Autowired
    DiscoveryClient discoveryClient;

    @GetMapping("getByName")
    public Product getByName(@RequestParam String productName) {
        Product product = productDao.findByName(productName);
        return product;
    }

    @GetMapping("intance-info")
    public Object getInfo() {
        List<String> services = this.discoveryClient.getServices();
        List<ServiceInstance> serviceInstances = discoveryClient.getInstances(services.get(0));
        return JSONObject.toJSONString(services) + JSONObject.toJSONString(serviceInstances);
    }
}
