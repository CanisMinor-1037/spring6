package org.canisminor.spring6.resource.dao;

import org.springframework.stereotype.Repository;

@Repository(value = "myUserDao")
public class UserDaoImpl implements UserDao{
    @Override
    public void add() {
        System.out.println("\t\tuserDao.add()...");
    }
}
