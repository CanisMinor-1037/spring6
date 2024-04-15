package org.canisminor.bean.impl;

import org.canisminor.annotation.Bean;
import org.canisminor.annotation.Di;
import org.canisminor.bean.ApplicationContext;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.net.URLDecoder;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class AnnotationApplicationContext implements ApplicationContext {
    Map<Class, Object> beanFactory = new HashMap<>();
    private String rootPath;

    @Override
    public Object getBean(Class clazz) {
        return beanFactory.get(clazz);
    }

    public AnnotationApplicationContext(String basePackage) {
        String packagePath = basePackage.replaceAll("\\.", "\\\\");

        try {
            Enumeration<URL> resources = Thread.currentThread().getContextClassLoader().getResources(packagePath);
            while (resources.hasMoreElements()) {
                URL resource = resources.nextElement();
                String filePath = URLDecoder.decode(resource.getFile(), "utf-8");
                rootPath = filePath.substring(0, filePath.length() - packagePath.length());

                loadBean(new File(filePath));
            }
        } catch (IOException | ClassNotFoundException | NoSuchMethodException | InvocationTargetException |
                 InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }

        loadDi();
    }

    private void loadBean(File file) throws
            ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        // 判断当前是否是文件夹
        if (file.isDirectory()) { // 是文件夹
            // 获取文件夹所有内容
            File[] childFiles = file.listFiles();
            // 文件夹为空，直接返回
            if (childFiles == null || childFiles.length == 0) {
                return;
            }
            // 文件夹不为空，遍历文件夹
            for (File childFile : childFiles) {
                // 遍历得到每个File对象
                if (childFile.isDirectory()) { // 当前是文件夹
                    loadBean(childFile); // 递归
                } else { // 当前是文件
                    // 得到包路径+类名称部分
                    String pathWithClass = childFile.getAbsolutePath().substring(rootPath.length() -1);
                    // 判断当前文件类型是否为.class
                    if (pathWithClass.contains(".class")) { //是.class类型
                        // 把\替换成. 把.class去掉
                        String allName = pathWithClass.replaceAll("\\\\", ".").replace(".class", "");
                        // 获取类的Class
                        Class<?> clazz = Class.forName(allName);
                        // 判断是否为接口
                        if (!clazz.isInterface()) { // 不是接口
                            // 判断类上是否有@Bean注解
                            Bean annotation = clazz.getAnnotation(Bean.class);
                            if (annotation != null) { // 有@Bean注解
                                // 实例化
                                Object instance = clazz.getConstructor().newInstance();
                                // 将实例化的对象放入BeanFactory
                                // 判断类是否有接口
                                if (clazz.getInterfaces().length > 0) { // 有接口, 接口class作为key
                                    beanFactory.put(clazz.getInterfaces()[0], instance);
                                } else { // 没有接口, 类class作为key
                                    beanFactory.put(clazz, instance);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    private void loadDi() {
        // 遍历map集合beanFactory
        Set<Map.Entry<Class, Object>> entries = beanFactory.entrySet();
        for (Map.Entry<Class, Object> entry : entries) {
            // 获取每个对象(value)
            Object obj = entry.getValue();
            // 获取对象的每个属性
            Class<?> clazz = obj.getClass();
            Field[] fields = clazz.getDeclaredFields();
            for (Field field : fields) {
                // 判断属性上是否有@Di注解
                Di annotation = field.getAnnotation(Di.class);
                if (annotation != null) {
                    // 有@Di注解, 注入属性
                    field.setAccessible(true);
                    try {
                        field.set(obj, beanFactory.get(field.getType()));
                    } catch (IllegalAccessException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
    }
}
