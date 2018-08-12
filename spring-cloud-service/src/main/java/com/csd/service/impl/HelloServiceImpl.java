package com.csd.service.impl;

import com.csd.service.HelloService;
import org.springframework.stereotype.Service;

/**
 * Created by sdc on 2018/8/12.
 */
@Service
public class HelloServiceImpl implements HelloService {
    @Override
    public String hello() {
        return "hello sprigncloud";
    }
}
