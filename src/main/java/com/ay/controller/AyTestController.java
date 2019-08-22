package com.ay.controller;

import com.ay.model.AyUser;
import com.ay.service.AyUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.jws.WebParam;
import java.util.List;


@Controller
@RequestMapping("/user")
public class AyTestController {

    @Resource
    private AyUserService ayUserService;


    @RequestMapping("/findAll")
    public String findAll(Model model){
        System.out.println("11111");

        List<AyUser>ls= ayUserService.findAll();

        System.out.println(ls);

        return "hello";
    }
}
