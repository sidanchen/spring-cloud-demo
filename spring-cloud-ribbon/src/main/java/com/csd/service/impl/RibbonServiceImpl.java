package com.csd.service.impl;

import com.csd.service.RibbonService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by sdc on 2018/8/12.
 */
@Service
public class RibbonServiceImpl implements RibbonService {

    @Autowired
    RestTemplate restTemplate;

    @Override
    @HystrixCommand(fallbackMethod = "errorMethod")
    public String hello() {
        return restTemplate.getForObject("http://HELLO-SERVICE/hello/hello",String.class);
    }



    public String errorMethod(){
        return "this is hystrix return string";
    }
}
