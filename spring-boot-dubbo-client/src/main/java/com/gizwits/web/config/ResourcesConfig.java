package com.gizwits.web.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
class ResourcesConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {

        //   注册自己的资源

//        registry.addResourceHandler("/**")
//                .addResourceLocations("/WEB-INF/resources/")
//                .setCachePeriod(0);
    }
}