package org.canisminor.spring6.iocxml.auto.controller;

import org.canisminor.spring6.iocxml.auto.service.UserService;

public class UserController {

    private UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public void addUser() {
        System.out.println("Controller方法执行了");
        userService.addUserService();
    }
}
