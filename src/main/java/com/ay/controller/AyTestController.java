package com.ay.controller;

import com.ay.model.AyUser;
import com.ay.service.AyUserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import java.util.List;


@Controller
@RequestMapping(value = "/user")
public class AyTestController {

    @Resource
    private AyUserService ayUserService;

    @RequestMapping(value = "/findAll",method = RequestMethod.GET)
    public String findAll(Model model){
        List<AyUser> ayUserList = ayUserService.findAll();
        for(AyUser ayUser : ayUserList){
            System.out.println("id: " + ayUser.getId());
            System.out.println("name: " + ayUser.getName());
        }
        return "hello";
    }
}
