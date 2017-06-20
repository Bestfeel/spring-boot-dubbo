package com.gizwits.web.controller;

import com.wordnik.swagger.annotations.Api;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zl on 2015/8/27.
 */
@Api(basePath = "/swagger", value = "Landlords", description = "Operations with Landlords", produces = "application/json")
@RestController
@RequestMapping(value = "/swaggers", produces = MediaType.APPLICATION_JSON_VALUE)
public class SwaggerController {

    private static final Logger logger = LoggerFactory.getLogger(SwaggerController.class);
    /*
     *  http://localhost:8080/swagger/index.html
     */


}