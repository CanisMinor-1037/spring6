package org.canisminor.spring6.junit.junit5;

import org.springframework.stereotype.Component;

@Component("junit5User")
public class User {
    public void run() {
        System.out.println("User.run() executed.");
    }
}
