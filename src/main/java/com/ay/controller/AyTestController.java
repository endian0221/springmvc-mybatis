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
    @RequestMapping("/findAllById")
    public void findAllById(Model model){
        AyUser ayUserList=ayUserService.findAllById(0);
        System.out.println(ayUserList.getId()+ayUserList.getName()+ayUserList.getPassword());
    }
    @RequestMapping("/insert")
    public void insertAyUser(Model model){
        AyUser ayUser=new AyUser();
        ayUser.setId(1);
        ayUser.setName("张某");
        ayUser.setPassword("787594");
        ayUserService.insertAyUser(ayUser);
    }
    @RequestMapping("/update")
    public void updateAyUser(Model model){
        AyUser ayUser=new AyUser();
        ayUser.setId(1);
        ayUser.setName("xiao");
        ayUser.setPassword("787594");
        ayUserService.updateAyUser(ayUser);
    }
    @RequestMapping("/delete")
    public void deleteAyUser(Model model){
        ayUserService.deleteAyUser(1);
    }


}
