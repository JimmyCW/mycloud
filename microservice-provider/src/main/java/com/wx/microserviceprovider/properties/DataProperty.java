package com.wx.microserviceprovider.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "spring.datasource")
@Data
public class DataProperty {

    private String url;
    private String username;
    private String password;
    private String driverClassName;
    private Integer initialSize;
    private Long maxWait;
    private Integer maxActive;
    private String filters;

}
