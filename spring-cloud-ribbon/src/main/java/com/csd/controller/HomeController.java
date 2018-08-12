package com.csd.controller;

import com.csd.service.RibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sdc on 2018/8/12.
 */
@RestController
public class HomeController {
    @Autowired
    RibbonService ribbonService;

    @RequestMapping("/ribbon")
    public String ribbon(){
        return ribbonService.hello();
    }
}
