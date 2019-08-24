package com.ay.controller.test;

import com.ay.dao.AyUserDao;
import com.ay.model.AyUser;
import org.junit.Test;

import javax.annotation.Resource;
import java.util.List;

/***
 * 集成BaseJunit4Test
 */
public class AyUserDaoTest extends BaseJunit4Test  {

    @Resource
    private AyUserDao ayUserDao;
    @Test
    public void testFindAll(){
        List<AyUser> ls=ayUserDao.findAll();
        System.out.println("查询出来的人数："+ls.size());
    }
}
