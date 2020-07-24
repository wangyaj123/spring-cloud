package com.my.ribbonclient.controller;

import com.my.ribbonclient.service.RibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RibbonController {
    @Autowired
    private RibbonService ribbonService;

    @RequestMapping("/getHello")
    public String getHello(@RequestParam String name){
        return ribbonService.getHello(name);
    }
}
