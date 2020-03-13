package com.wx.servicefeign.service;

import org.springframework.stereotype.Component;

@Component
public class FeignServiceHystrix implements FeignService{

    @Override
    public String helloFeign(String name) {
        return "hello,"+name+",Feign调用服务error...";
    }
}
