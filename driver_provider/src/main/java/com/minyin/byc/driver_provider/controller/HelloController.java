package com.minyin.byc.driver_provider.controller;

import com.minyin.byc.driver_provider.bean.User;
import com.minyin.byc.driver_provider.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class HelloController {

    @Value("${server.port}")
    String port;

    @Autowired
    private HelloService service;

    @RequestMapping("/hi")
    @ResponseBody
    public User home(@RequestParam String name) {

        System.out.println("你好，我是考驾照服务！端口号是--"+port);

        return service.selectUser(2);
    }
}
