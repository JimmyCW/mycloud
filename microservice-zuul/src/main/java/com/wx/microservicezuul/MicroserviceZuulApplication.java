package com.wx.microservicezuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * zuul地址/服务名称/服务路径
 * http://localhost:9007/micro-provider/product/getByName?productName=1
 *
 */
@SpringBootApplication
@EnableZuulProxy
public class MicroserviceZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceZuulApplication.class, args);
    }

}
