package org.canisminor.spring6.iocxml.dimap;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStudent {
    @Test
    public void testStudent() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-dimap.xml");
        Student student = (Student) context.getBean("student");
        System.out.println(student);
    }

    @Test
    public void testStudent2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-diref.xml");
        Student student = (Student) context.getBean("student");
        System.out.println(student);
    }

    @Test
    public void testStudent3() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-diref.xml");
        Student student = (Student) context.getBean("studentp");
        System.out.println(student);
    }
}
