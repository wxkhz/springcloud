package com.wx.servicefeign.controller;

import com.wx.servicefeign.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController {
    @Autowired
    FeignService feignService;

    @GetMapping("helloFeign")
    public String helloFeign(String name) {
        return feignService.helloFeign(name);
    }
}
