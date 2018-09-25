package com.minyin.byc.ribbon_customer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;


    public String hiService(String name) {
        return restTemplate.getForObject("http://USER-PROVIDER/hi?name="+name,String.class);
    }

    public String hiService1(String name) {
        return restTemplate.getForObject("http://DRIVER-PROVIDER/hi?name="+name,String.class);
    }
}
