package com.gizwits.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Controller;

@Controller
@EnableAutoConfiguration//启用自动配置
@SpringBootApplication
//@ImportResource({"classpath:dubbo-custom.xml"})
public class Custom {
//    @Bean(name = "/HelloService")
//    public HessianServiceExporter hessianServiceExporter() {
//        HessianServiceExporter export = new HessianServiceExporter();
//
//        export.setService(helloService);
//        export.setServiceInterface(HelloService.class);
//
//
//        return export;
//    }


    public static void main(String[] args) throws Exception {

        //开启监控 http://localhost:8080/health
        //SpringApplication.run(SampleController.class, "--server.port=8081");


        // System.out.println("port---------" + properties.getPort());
        //   SpringApplication.run(Custom.class, args);
        SpringApplication.run(Custom.class, "--server.port=8081");

        //Custom custom = new Custom();
        //custom.customService.show();


    }
}