package com.wx.discoveryeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaServer
@ComponentScan(basePackages = "com.wx.discoveryeureka")
@ServletComponentScan
public class DiscoveryEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(DiscoveryEurekaApplication.class, args);
    }
}
