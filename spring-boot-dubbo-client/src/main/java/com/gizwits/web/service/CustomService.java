package com.gizwits.web.service;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

/**
 * Created by feel on 16/5/21.
 */
@Service
public class CustomService {


    @Reference
    private HelloService helloService;

    public void show() {

        System.out.println(helloService);

        String s = helloService.sayHello();
        System.out.println("CustomService---->" + s);

    }

}
