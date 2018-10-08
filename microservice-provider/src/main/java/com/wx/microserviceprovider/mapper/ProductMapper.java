package com.wx.microserviceprovider.mapper;

import com.wx.microserviceprovider.entity.Product;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ProductMapper {
    Product selectByProductName(String productName);
}
