package org.canisminor.service.impl;

import org.canisminor.annotation.Bean;
import org.canisminor.annotation.Di;
import org.canisminor.dao.UserDao;
import org.canisminor.service.UserService;

@Bean
public class UserServiceImpl implements UserService {
    @Di
    private UserDao userDao;

    @Override
    public void userServiceMethod() {
        System.out.println("UserService.userServiceMethod() executed.");
        userDao.userDaoMethod();
    }
}
