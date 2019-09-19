package com.ay.controller;

import com.ay.model.AyUser;
import com.ay.service.AyUserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class AyTestController {


    @Resource
    private AyUserService ayUserService;


    /***
     * 查询全部
     * @param model
     * @return
     */
//    @ResponseBody
    @RequestMapping(value = "/findAll",method = RequestMethod.GET)
    public Object findAll(Model model){
        List<AyUser> ayUserList = ayUserService.findAll();
        for(AyUser ayUser : ayUserList){
            System.out.println("id: " + ayUser.getId());
            System.out.println("name: " + ayUser.getName());
        }
//        return ayUserList;
        return "hello";
    }
    /***
     * 根据id查询
     * @param model
     */
    @RequestMapping("/findById")
    public void findAllById(Model model){
        AyUser ayUserList=ayUserService.findById(1001);
        System.out.println(ayUserList.getId()+ayUserList.getName()+ayUserList.getPassword());
    }

    /***
     * 根据name查询
     * @param model
     */
    @RequestMapping("/findByName")
    public void findAllByName(Model model){
        AyUser ayUserList=ayUserService.findByName("张某");
        System.out.println(ayUserList.getId()+ayUserList.getName()+ayUserList.getPassword());
    }

    /***
     * 插入
     * @param model
     */
    @RequestMapping("/insert")
    public void insertAyUser(Model model){
        AyUser ayUser=new AyUser();
        ayUser.setId(1005);
        ayUser.setName("张某");
        ayUser.setPassword("787594");
        ayUserService.insert(ayUser);
    }

    /***
     * 修改
     * @param model
     */
    @RequestMapping("/update")
    public void updateAyUser(Model model){
        AyUser ayUser=new AyUser();
        ayUser.setId(1005);
        ayUser.setName("xiao");
        ayUser.setPassword("787594");
        ayUserService.update(ayUser);
    }

    /***
     * 删除
     * @param model
     */
    @RequestMapping("/delete")
    public void deleteAyUser(Model model){
        ayUserService.delete(1);
    }

    //使用if标签实现查询
    @RequestMapping("/if")
    public void nameAndPassword(Model model){

        List<AyUser> ls=ayUserService.findNameAndPassword("刘某","");
        for (AyUser ayUser:ls){
            System.out.println(ayUser.getId()+ayUser.getName()+ayUser.getPassword());
        }
    }


    //使用where标签实现拼接查询
    @RequestMapping("/where")
    public void nameOrPassword(Model model){

        List<AyUser> ls=ayUserService.findNameOrPassword("刘某");
        for (AyUser ayUser:ls){
            System.out.println(ayUser.getId()+ayUser.getName()+ayUser.getPassword());
        }
    }

//    使用set标签实现修改
    @RequestMapping("/updata2")
    public void updata2(){

        AyUser ayUser=new AyUser();
        ayUser.setId(1005);
        ayUser.setName("");
        ayUser.setPassword("34543");
        ayUserService.updata2(ayUser);
    }

    /***
     * 使用bind标签，实现模糊查询
     */

    @RequestMapping("/bind")
    public void bind(){

        List<AyUser> ls= ayUserService.bind("某","");
        for (AyUser ayUser:ls){
            System.out.println(ayUser.getId());
            System.out.println(ayUser.getName());
            System.out.println(ayUser.getPassword());
        }
    }

//    @RequestMapping("/json")
//    @ResponseBody
//    public Object jsonTest(){
//        AyUser ayUser=new AyUser();
//        ayUser.setName("名人");
//        ayUser.setPassword("123123");
//        return ayUser;
//    }

}
