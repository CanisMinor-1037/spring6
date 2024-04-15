package org.canisminor;

import org.canisminor.bean.ApplicationContext;
import org.canisminor.bean.impl.AnnotationApplicationContext;
import org.canisminor.controller.UserController;
import org.canisminor.service.UserService;
import org.junit.jupiter.api.Test;

public class TestUser {
    @Test
    public void testUser1() {
        ApplicationContext context = new AnnotationApplicationContext("org.canisminor");
        UserService userService = (UserService) context.getBean(UserService.class);
        System.out.println(userService);

        userService.userServiceMethod();
    }

    @Test
    public void testUser2() {
        ApplicationContext context = new AnnotationApplicationContext("org.canisminor");
        UserController userController = (UserController) context.getBean(UserController.class);
        System.out.println(userController);
        userController.userControllerMethod();
    }
}
