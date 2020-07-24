package com.my.feignclient.controller;

import com.my.feignclient.service.FeignRemoteService;
import com.my.feignclient.service.HystrixService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController {
    @Autowired
    private FeignRemoteService feignRemoteService;
    @Autowired
    private HystrixService hystrixService;

    @GetMapping("/getHello")
    public String getHello(@RequestParam String name){
        return feignRemoteService.hello(name);
    }

    @GetMapping("getStr")
    public String getStr(){
        return hystrixService.getString();
    }
}
