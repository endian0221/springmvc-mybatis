package com.ay.service;
import com.ay.model.*;

import java.util.List;


public interface AyUserService {
    //查询全部接口
    List<AyUser> findAll();
    //根据id查询
    AyUser findById(int id);
    //根据名字查询
    AyUser findByName(String name);
    //插入一条数据
    int insert(AyUser ayUser);
    //修改用户数据
    int update(AyUser ayUser);
    //删除一条数据
    int delete(int id);
    //动态拼接，根据名字查询或者根据密码查询
    List<AyUser> findNameAndPassword(String name, String password);

    List<AyUser> findNameOrPassword(String name);

    int updata2(AyUser ayUser);

    List<AyUser>bind(String name,String password);

}
