package org.canisminor.spring6.resource.service;

import jakarta.annotation.Resource;
import org.canisminor.spring6.resource.dao.UserDao;
import org.springframework.stereotype.Service;

@Service(value = "myUserService")
public class UserServiceImpl implements UserService{
    @Resource(name = "myUserDao")
    private UserDao userDao;

    @Override
    public void add() {
        System.out.println("\tuserService.add()...");
        userDao.add();
    }
}
