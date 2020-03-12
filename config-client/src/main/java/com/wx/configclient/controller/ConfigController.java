package com.wx.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {
    @Value(value = "${config.demo}")
    private String info;

    @RequestMapping("/info")
    public String getInfo() {
        return info;
    }
}
