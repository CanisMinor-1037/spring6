package org.canisminor.dao.impl;

import org.canisminor.annotation.Bean;
import org.canisminor.dao.UserDao;

@Bean
public class UserDaoImpl implements UserDao {
    @Override
    public void userDaoMethod() {
        System.out.println("UserDaoImpl.userDaoMethod() executed.");
    }
}
