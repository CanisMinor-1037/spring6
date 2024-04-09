package org.canisminor.spring6.iocxml.lifecycle;

public class User {
    private String name;

    public User() {
        System.out.println("1 调用无参数构造创建bean对象");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("2 给bean对象设置属性值");
        this.name = name;
    }

    public void init() {
        System.out.println("4 调用方法初始化bean对象");
    }

    public void destroy() {
        System.out.println("7 调用方法销毁bean对象");
    }

}
