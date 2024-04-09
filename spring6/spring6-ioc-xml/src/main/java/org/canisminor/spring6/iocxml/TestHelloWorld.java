package org.canisminor.spring6.iocxml;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestHelloWorld {
    @Test
    public void HelloWorld2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        HelloWorld helloWorld = (HelloWorld) context.getBean(HelloWorld.class);
        System.out.println("根据类型获取bean:" + helloWorld);
    }
}
