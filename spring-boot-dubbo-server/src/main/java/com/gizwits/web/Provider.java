package com.gizwits.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@EnableAutoConfiguration
@SpringBootApplication
//@ComponentScan(value = "com.gizwits.web")
@ImportResource({"classpath:dubbo-provider.xml"})
public class Provider {

//    @Autowired
//    private HelloService helloService;

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
        SpringApplication.run(Provider.class, args);
    }
}