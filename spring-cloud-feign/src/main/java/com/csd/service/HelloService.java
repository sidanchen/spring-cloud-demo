package com.csd.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by sdc on 2018/8/12.
 */
@FeignClient("HELLO-SERVICE")
public interface HelloService {

    @RequestMapping("/hello/hello")
    String hello();
    @RequestMapping("/hello/hello1")
    String hello(@RequestParam("s") String s);
}
