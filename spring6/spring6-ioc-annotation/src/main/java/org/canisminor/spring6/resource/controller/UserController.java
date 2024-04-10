package org.canisminor.spring6.resource.controller;

import jakarta.annotation.Resource;
import org.canisminor.spring6.resource.service.UserService;
import org.springframework.stereotype.Controller;

@Controller(value = "myUserController")
public class UserController {
//    @Resource(name = "myUserService")
//    private UserService userService;

    @Resource
    private UserService userService;

    public void add() {
        System.out.println("userController.add()...");
        userService.add();
    }
}
