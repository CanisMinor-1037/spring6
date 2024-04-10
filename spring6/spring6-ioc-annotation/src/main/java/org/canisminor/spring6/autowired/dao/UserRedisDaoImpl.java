package org.canisminor.spring6.autowired.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserRedisDaoImpl implements UserDao {
    @Override
    public void add() {
        System.out.println("\t\tuserRedisDao.add()...");
    }
}

