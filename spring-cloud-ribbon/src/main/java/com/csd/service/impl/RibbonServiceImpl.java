package com.csd.service.impl;

import com.csd.service.RibbonService;
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
    public String hello() {
        return restTemplate.getForObject("http://HELLO-SERVICE/hello/hello",String.class);
    }
}
