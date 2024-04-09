package org.canisminor.spring6;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;


public class TestUser {
    Logger logger = LoggerFactory.getLogger(TestUser.class);

    @Test
    public void testUserObject() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");

        User user = (User) applicationContext.getBean("user");
        System.out.println(user);

        user.add();

        logger.info("### 调用成功了");
    }

    @Test
    public void testUserObject1() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?> clazz = Class.forName("org.canisminor.spring6.User");

        User user = (User) clazz.getDeclaredConstructor().newInstance();
        System.out.println(user);
    }
}
