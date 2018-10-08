package com.wx.discoveryeureka.entity;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Product {

    private Long id;

    private String productName;

    private BigDecimal price;
}
