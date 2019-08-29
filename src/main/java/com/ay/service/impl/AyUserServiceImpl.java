package com.ay.service.impl;

import com.ay.dao.AyUserDao;
import com.ay.model.AyUser;
import com.ay.service.AyUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class AyUserServiceImpl implements AyUserService {
    @Resource
    private AyUserDao ayUserDao;

    public List<AyUser> findAll() {
        return ayUserDao.findAll();
    }

    @Override
    public AyUser findByName(String name) {
        return ayUserDao.findByName(name);
    }

    @Override
    public AyUser findById(int id) {
        return ayUserDao.findById(id);
    }
    @Override
    public int update(AyUser ayUser) {
        return ayUserDao.update(ayUser);
    }
    @Override
    public int delete(int id) {
        return ayUserDao.delete(id);
    }

    @Override
    public List<AyUser> findNameAndPassword(String name, String password) {
        return ayUserDao.findNameAndPassword(name,password);
    }

    @Override
    public List<AyUser> findNameOrPassword(String name) {
        return ayUserDao.findNameOrPassword(name);
    }

    @Override
    public int insert(AyUser ayUser) {
        return ayUserDao.insert(ayUser);
    }

    @Override
    public int updata2(AyUser ayUser) {
        return ayUserDao.updata2(ayUser);
    }

    @Override
    public List<AyUser> bind(String name, String password) {
        return ayUserDao.bind(name,password);
    }
}


