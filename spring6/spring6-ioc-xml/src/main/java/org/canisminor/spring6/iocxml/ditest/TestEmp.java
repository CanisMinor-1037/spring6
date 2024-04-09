package org.canisminor.spring6.iocxml.ditest;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEmp {
    @Test
    public void testEmp() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean-ditest.xml");
        Emp emp = (Emp) context.getBean("emp");
        emp.work();
    }

    @Test
    public void testEmp2() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean-ditest.xml");
        Emp emp = (Emp) context.getBean("emp2");
        emp.work();
    }

    @Test
    public void testEmp3() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean-ditest.xml");
        Emp emp = (Emp) context.getBean("emp3");
        emp.work();
    }

    @Test
    public void testEmp4() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean-diarray.xml");
        Emp emp = (Emp) context.getBean("emp");
        emp.work();
    }
}
