package org.canisminor.spring6.iocxml.factoryBean;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUser {
    @Test
    public void testUser() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-factoryBean.xml");
        User user = (User) context.getBean("user");
        System.out.println(user);
    }
}
