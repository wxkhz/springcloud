package com.wx.servicefeign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "eureka-producer",fallback = FeignServiceHystrix.class)
public interface FeignService {
    @GetMapping("/helloEureka")
    String helloFeign(@RequestParam String name);
}
