package com.csd.service.impl;

import com.csd.service.HelloService;
import org.springframework.stereotype.Service;

import java.util.Random;

/**
 * Created by sdc on 2018/8/12.
 */
@Service
public class HelloServiceImpl implements HelloService {
    @Override
    public String hello() {
//        int sl = new Random().nextInt(7);
//        try {
//            System.out.println(sl*1000);
//            Thread.sleep(sl*1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        return "hello sprigncloud";
    }

    @Override
    public String hello(String s) {
        return "hello this is parame:"+s;
    }
}
