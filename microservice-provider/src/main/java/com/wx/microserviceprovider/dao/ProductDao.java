package com.wx.microserviceprovider.dao;

import com.wx.microserviceprovider.entity.Product;
import com.wx.microserviceprovider.mapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ProductDao {

    @Autowired
    private ProductMapper productMapper;

    public Product findByName(String productName) {
        return productMapper.selectByProductName(productName);
    }

}
