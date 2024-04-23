package org.canisminor.spring6.jdbc;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig(locations = "classpath:bean.xml")
public class JDBCTemplateTest {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test
    public void test1() {
        String sql = "INSERT INTO temp VALUES(NULL,?,?,?)";
        int rows = jdbcTemplate.update(sql, "Alice", 20, "F");
        System.out.println(rows);
        rows = jdbcTemplate.update(sql, "Bob", 23, "M");
        System.out.println(rows);
        rows = jdbcTemplate.update(sql, "Cindy", 24, "F");
        System.out.println(rows);
    }

    @Test
    public void test2() {
        String sql = "UPDATE temp SET name=? WHERE id=?";
        int rows = jdbcTemplate.update(sql, "Dave", 2);
        System.out.println(rows);
    }

    @Test
    public void test3() {
        String sql = "DELETE FROM temp WHERE id=?";
        int rows = jdbcTemplate.update(sql, 3);
        System.out.println(rows);
    }
}
