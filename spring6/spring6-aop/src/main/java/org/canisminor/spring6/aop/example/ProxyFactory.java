package org.canisminor.spring6.aop.example;

public class ProxyFactory {
    private Object target;
    public ProxyFactory(Object target) {
        this.target = target;
    }


}
