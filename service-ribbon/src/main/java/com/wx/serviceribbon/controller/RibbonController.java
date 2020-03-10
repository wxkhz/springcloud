package com.wx.serviceribbon.controller;

import com.wx.serviceribbon.service.RibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RibbonController {
    @Autowired
    RibbonService ribbonService;

    @GetMapping(value = "/helloRibbon")
    public String helloRibbon(@RequestParam String name) {
        return ribbonService.helloService(name);
    }
}
