package org.canisminor.spring6.resource;

import org.canisminor.spring6.config.SpringConfig;
import org.canisminor.spring6.resource.controller.UserController;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUserController {
    @Test
    public void testUserController() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        UserController userController = context.getBean("myUserController" ,UserController.class);
        userController.add();
    }

    @Test
    public void testUserController2() {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserController userController = context.getBean("myUserController", UserController.class);
        userController.add();
    }
}
