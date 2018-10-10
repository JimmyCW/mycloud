package com.wx.discoveryeureka.dao;

import com.wx.discoveryeureka.entity.Product;
import com.wx.discoveryeureka.mapper.ProductMapper;
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
