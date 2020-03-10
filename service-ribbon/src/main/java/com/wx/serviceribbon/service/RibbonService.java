package com.wx.serviceribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RibbonService {
    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "ribbonError")
    public String helloService(String name) {
        return restTemplate.getForObject("http://eureka-producer/helloEureka?name="+name, String.class);
    }

    public String ribbonError(String name) {
        return "hello,,,"+name+",ribbon error";
    }
}
