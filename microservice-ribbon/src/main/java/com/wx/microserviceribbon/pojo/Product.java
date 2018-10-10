package com.wx.microserviceribbon.pojo;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class Product implements Serializable {

    private Long id;

    private String productName;

    private BigDecimal price;
}
