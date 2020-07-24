package com.my.hystrixclient.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HystrixController {
    /**
     * @HystrixCommand(fallbackMethod="getString_back")表示出现异常即执行指定的方法
     * @return
     */
    @RequestMapping("/getStr")
    @HystrixCommand(fallbackMethod="getString_back")
    public String getString(){
        int a = 1/0;
        return "调用原来的服务";
    }
    //备用方法
    public String getString_back(){
        return "备用服务1";
    }
}
