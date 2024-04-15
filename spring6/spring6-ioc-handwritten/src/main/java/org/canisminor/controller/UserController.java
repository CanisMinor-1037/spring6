package org.canisminor.controller;

import org.canisminor.annotation.Bean;
import org.canisminor.annotation.Di;
import org.canisminor.service.UserService;

@Bean
public class UserController {
    @Di
    UserService userService;

    public void userControllerMethod() {
        System.out.println("UserController.userControllerMethod() executed.");
        userService.userServiceMethod();
    }
}
