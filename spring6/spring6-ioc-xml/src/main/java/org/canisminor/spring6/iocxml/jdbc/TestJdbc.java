package org.canisminor.spring6.iocxml.jdbc;

import com.alibaba.druid.pool.DruidDataSource;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestJdbc {
    @Test
    public void testJdbc() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-jdbc.xml");
        DruidDataSource dataSource = (DruidDataSource) context.getBean("druidDataSource");
        System.out.println(dataSource.getUsername());
    }

    @Test
    public void testJdbc2() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setUsername("seed");
        dataSource.setPassword("dees");
        dataSource.setUrl("jdbc:mysql://localhost:3306/spring");
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
    }
}
