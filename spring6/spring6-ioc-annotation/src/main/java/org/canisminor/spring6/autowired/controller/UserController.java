package org.canisminor.spring6.autowired.controller;

import org.canisminor.spring6.autowired.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

//    public UserController(UserService userService) {
//        this.userService = userService;
//    }

    //    public UserController(@Autowired UserService userService) {
//        this.userService = userService;
//    }

    //    @Autowired
//    public UserController(UserService userService) {
//        this.userService = userService;
//    }

    //    @Autowired
//    public void setUserService(UserService userService) {
//        this.userService = userService;
//    }

    public void add() {
        System.out.println("userController.add()...");
        userService.add();
    }
}
