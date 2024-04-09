package org.canisminor.spring6.iocxml;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUser {
    @Test
    public void getBean() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        User user1 = (User) context.getBean("user");
        System.out.println("根据id获取bean:" + user1);

        User user2 = (User) context.getBean(User.class);
        System.out.println("根据类型获取bean:" + user2);

        User user3 = (User) context.getBean("user", User.class);
        System.out.println("根据id和类型获取bean:" + user3);
    }
}
