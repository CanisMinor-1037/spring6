package org.canisminor.spring6.iocxml.scope;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestOrders {
    @Test
    public void testOrders() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-scope.xml");
        Orders orders = (Orders) context.getBean("orders");
        System.out.println(orders);
    }

    @Test
    public void testOrders2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-scope.xml");
        Orders orders1 = (Orders) context.getBean("orders");
        System.out.println(orders1);

        Orders orders2 = (Orders) context.getBean("orders");
        System.out.println(orders2);
    }

    @Test
    public void testOrders3() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-scope.xml");
        Orders orders1 = (Orders) context.getBean("orders2");
        System.out.println(orders1);

        Orders orders2 = (Orders) context.getBean("orders2");
        System.out.println(orders2);
    }
}
