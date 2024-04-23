package org.canisminor.spring6.junit.junit4;

import org.springframework.stereotype.Component;

@Component("junit4User")
public class User {
    public void run() {
        System.out.println("User.run() executed.");
    }
}
