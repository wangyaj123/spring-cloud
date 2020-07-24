package com.my.eurekaclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {
    @Value("${server.port}")
    private String port;
    @RequestMapping("/hello")
    public String test(@RequestParam(value = "name", defaultValue = "tome")String name){
        return name + ",welcome to springcloud! server port:" +port;
    }
}
