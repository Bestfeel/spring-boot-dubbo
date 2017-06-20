package com.gizwits.web.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.gizwits.web.service.HelloService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Reference
    private HelloService helloService;

    @RequestMapping("/hello")
    public String helle() {

        return helloService.sayHello();
    }

}