package com.wx.selfservice;

import com.wx.microserviceribbon.service.FeignService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(clients = FeignService.class)
public class SelfServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SelfServiceApplication.class);
    }
}
