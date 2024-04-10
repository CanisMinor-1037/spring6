package org.canisminor.spring6.iocxml.auto.service;

import org.canisminor.spring6.iocxml.auto.dao.UserDao;

public class UserServiceImpl implements UserService {
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void addUserService() {
        System.out.println("addUserService执行了");
        userDao.addUserDao();
    }
}
