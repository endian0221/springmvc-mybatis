package com.ay.service;
import com.ay.model.*;

import java.util.List;


public interface AyUserService {
    //查询全部接口
    List<AyUser> findAll();
    //根据id查询
    AyUser findAllById(int id);
    //插入一条数据
    int insertAyUser(AyUser ayUser);
    //修改用户数据
    int updateAyUser(AyUser ayUser);
    //删除一条数据
    int deleteAyUser(int id);

}
