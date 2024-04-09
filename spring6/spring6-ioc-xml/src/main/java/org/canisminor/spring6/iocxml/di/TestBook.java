package org.canisminor.spring6.iocxml.di;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBook {
    @Test
    public void testBook1() {
        Book book = new Book();
        book.setName("The Tragedy of Hamlet, Prince of Denmark");
        book.setAuthor("William Shakespeare");
        System.out.println("name:" + book.getName());
        System.out.println("author:" + book.getAuthor());
    }

    @Test
    public void testBook2() {
        Book book = new Book("The Tragedy of Hamlet, Prince of Denmark", "William Shakespeare");
        System.out.println("name:" + book.getName());
        System.out.println("author:" + book.getAuthor());
    }

    @Test
    public void testSetter() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-di.xml");
        Book book = (Book) context.getBean("book");
        System.out.println("name:" + book.getName());
        System.out.println("author:" + book.getAuthor());
    }

    @Test
    public void testConstructor() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-di.xml");
        Book book = (Book) context.getBean("book2");
        System.out.println("name:" + book.getName());
        System.out.println("author:" + book.getAuthor());
    }

    @Test
    public void testXML() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-di.xml");
        Book book = (Book) context.getBean("book3");
        System.out.println(book);
    }

    @Test
    public void testCDATA() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-di.xml");
        Book book = (Book) context.getBean("book4");
        System.out.println(book);
    }
}
