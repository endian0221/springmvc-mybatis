package com.ay.dao;

import com.ay.model.AyUser;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AyUserDao {
    //查询全部
    List<AyUser> findAll();
    //根据id查询
    AyUser findAllById(int id);
    //插入用户
    int insertAyUser(AyUser ayUser);
    //修改用户数据
    int updateAyUser(AyUser ayUser);
    //删除一条数据
    int deleteAyUser(int id);

}