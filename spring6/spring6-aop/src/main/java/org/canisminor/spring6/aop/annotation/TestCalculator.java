package org.canisminor.spring6.aop.annotation;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCalculator {
    @Test
    public void testBeforeMethod() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        Calculator calculator = context.getBean(Calculator.class);
        calculator.add(2, 3);
        calculator.sub(7, 4);
        calculator.mul(2, 5);
        calculator.div(10, 5);
    }

    @Test
    public void testMethod() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        Calculator calculator = context.getBean(Calculator.class);
        calculator.div(10, 5);
    }

    @Test
    public void testMethod2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        Calculator calculator = context.getBean(Calculator.class);
        calculator.div(1, 0);
    }
}
