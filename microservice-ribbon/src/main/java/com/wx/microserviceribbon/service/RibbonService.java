package com.wx.microserviceribbon.service;

import com.wx.microserviceribbon.pojo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RibbonService {

    @Autowired
    RestTemplate restTemplate;

    public Product getByName(String name) {
        return restTemplate.getForObject("http://micro-provider/product/getByName?productName=" + name, Product.class);
    }
}
