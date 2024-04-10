package org.canisminor.spring6.autowired.service;

import org.canisminor.spring6.autowired.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    @Qualifier(value = "userRedisDaoImpl")
    private UserDao userDao;

//    public UserServiceImpl(UserDao userDao) {
//        this.userDao = userDao;
//    }

    //    public UserServiceImpl(@Autowired UserDao userDao) {
//        this.userDao = userDao;
//    }

//    @Autowired
//    public UserServiceImpl(UserDao userDao) {
//        this.userDao = userDao;
//    }




    //    @Autowired
//    public void setUserDao(UserDao userDao) {
//        this.userDao = userDao;
//    }

    @Override
    public void add() {
        System.out.println("\tuserService.add()...");
        userDao.add();
    }
}
