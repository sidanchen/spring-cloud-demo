package com.csd.controller;

import com.csd.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sdc on 2018/8/12.
 */
@RestController
public class HomeController {

    @Autowired
    HelloService helloService;

    @RequestMapping("/hello")
    public String hello(){
        return helloService.hello();
    }

    @RequestMapping("/hello1")
    public String hello1(String s){
        return helloService.hello(s);
    }
}
