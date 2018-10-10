package com.wx.selfservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/myInfo")
public class MyInfoController {

    @Value("${self.my}")
    private String my;

    @GetMapping("")
    public String getInfo() {
        return my;
    }

}
