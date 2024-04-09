package org.canisminor.spring6.iocxml.auto.dao;

public class UserDaoImpl implements UserDao{
    @Override
    public void addUserDao() {
        System.out.println("addUserDao执行了");
    }
}
