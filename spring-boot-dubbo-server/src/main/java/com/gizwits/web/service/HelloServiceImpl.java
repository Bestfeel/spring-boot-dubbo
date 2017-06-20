package com.gizwits.web.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by feel on 16/5/21.
 */
//@Service("/helloService")
public class HelloServiceImpl implements HelloService {
    private static final Logger logger = LoggerFactory.getLogger(HelloServiceImpl.class);

    @Override
    public String sayHello() {

        logger.info("client  sayHello ....");
        return "hello  say hello";
    }
}
