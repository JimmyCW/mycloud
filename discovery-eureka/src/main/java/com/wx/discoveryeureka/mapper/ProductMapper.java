package com.wx.discoveryeureka.mapper;

import com.wx.discoveryeureka.entity.Product;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ProductMapper {
    Product selectByProductName(String productName);
}
