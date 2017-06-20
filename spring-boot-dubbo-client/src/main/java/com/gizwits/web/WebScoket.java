package com.gizwits.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.server.standard.ServerEndpointExporter;

@EnableWebSocket
@Controller
@EnableAutoConfiguration//启用自动配置
@SpringBootApplication
public class WebScoket {
    @Bean
    public ServerEndpointExporter serverEndpointExporter() {
        return new ServerEndpointExporter();
    }

    @RequestMapping("/")
    String index() {

        return "webScoket";
    }

    public static void main(String[] args) throws Exception {


        SpringApplication.run(WebScoket.class);


    }
}