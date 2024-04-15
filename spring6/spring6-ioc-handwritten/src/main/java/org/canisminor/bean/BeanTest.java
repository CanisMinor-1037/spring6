package org.canisminor.bean;


import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.URL;
import java.net.URLDecoder;
import java.util.Enumeration;

public class BeanTest {
    @Test
    public void test1() {
        String basePackage = "org.canisminor";
        String packagePath = basePackage.replaceAll("\\.", "\\\\");

        try {
            Enumeration<URL> resources = Thread.currentThread().getContextClassLoader().getResources(packagePath);
            while (resources.hasMoreElements()) {
                URL resource = resources.nextElement();
                String filePath = URLDecoder.decode(resource.getFile(), "utf-8");
                System.out.println(filePath);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}
