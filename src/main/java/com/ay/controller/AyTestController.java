package com.ay.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/test")
public class AyTestController {

    @RequestMapping("/a")
    public String hello(){
        System.out.println("请求进来了");
        return "hello";
    }
}
