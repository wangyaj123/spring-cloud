package com.my.feignclient.fallback;

import com.my.feignclient.service.HystrixService;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

@Component
public class HystrixServiceFallBack implements FallbackFactory<HystrixService> {
    @Override
    public HystrixService create(Throwable throwable) {
        return new HystrixService() {
            @Override
            public String getString() {
                return "备用服务";
            }
        };
    }
}
