package com.my.feignclient.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @FeignClient（“服务名”），来指定调用哪个服务
 */
@FeignClient(value = "eureka-client")
public interface FeignRemoteService {
    /**
     * 抽象方法的注解、方法名、参数要和服务提供方保持一致（这里是与eureka-client模块中的 /hello方法保持一致）
     * @param name
     * @return
     */
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    String hello(@RequestParam(value = "name")String name);
}
