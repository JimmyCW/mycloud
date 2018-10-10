package com.wx.selfservice;

import com.wx.microserviceribbon.pojo.Product;
import com.wx.microserviceribbon.service.FeignService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class SelfServiceTest {

    @Autowired
    FeignService feignService;

    @Test
    public void feignTest() {
        Product product = feignService.getByProductName("x");
        System.out.println(product);
    }
}
