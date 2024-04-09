package org.canisminor.spring6.iocxml.bean;

public class AnotherUserDaoImpl implements UserDao{
    @Override
    public void run() {
        System.out.println("run......");
    }
}
