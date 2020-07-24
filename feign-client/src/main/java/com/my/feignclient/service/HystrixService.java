package com.my.feignclient.service;

import com.my.feignclient.fallback.HystrixServiceFallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "hystrix-client", fallbackFactory = HystrixServiceFallBack.class)
public interface HystrixService {
    @RequestMapping("/getStr")
    String getString();
}
