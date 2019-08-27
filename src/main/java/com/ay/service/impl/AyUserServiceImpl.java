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
    public AyUser findAllById(int id) {
        return ayUserDao.findAllById(id);
    }
    @Override
    public int updateAyUser(AyUser ayUser) {
        return ayUserDao.updateAyUser(ayUser);
    }
    @Override
    public int deleteAyUser(int id) {
        return ayUserDao.deleteAyUser(id);
    }
    @Override
    public int insertAyUser(AyUser ayUser) {
        return ayUserDao.insertAyUser(ayUser);
    }
}


