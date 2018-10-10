package com.wx.discoveryeureka.controller;


import com.wx.discoveryeureka.dao.ProductDao;
import com.wx.discoveryeureka.entity.Product;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
@Slf4j
public class ProductController {

    @Autowired
    ProductDao productDao;

    @GetMapping("getByName")
    public Product getByName(@RequestParam String productName) {
        Product product = productDao.findByName(productName);
        return product;
    }
}
