package com.my.ribbonclient.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RibbonService {
    @Autowired
    RestTemplate restTemplate;

    /**
     * 调用eureka-client模块中的hello方法
     * @param name
     * @return
     */
    public String getHello(String name){
        //用eureka-client服务名代替了ip地址，在ribbon中它会根据服务名来选择具体的服务实例，根据服务实例在请求的时候会用具体的url替换掉服务名。
        return restTemplate.getForObject("http://eureka-client/hello?name="+ name, String.class);
    }
}
