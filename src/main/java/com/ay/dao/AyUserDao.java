package com.ay.dao;

import com.ay.model.AyUser;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AyUserDao {
    //查询全部
    List<AyUser> findAll();
    //根据id查询
    AyUser findById(int id);
    //根据名字查询
    AyUser findByName(String name);
    //插入用户
    int insert(AyUser ayUser);
    //修改用户数据
    int update(AyUser ayUser);
    //删除一条数据
    int delete(int id);

    //根据名字和密码动态拼接查询
    List<AyUser> findNameAndPassword(@Param("name")String name, @Param("password")String password);
    //where标签拼接方式查询
    List<AyUser> findNameOrPassword(@Param("name")String name);
    //set标签拼接
    int updata2(AyUser ayUser);

    //bind
    List<AyUser>bind(@Param("name")String name,@Param("password")String password);
}
