package org.canisminor.spring6.iocxml.lifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("3 bean对象初始化之前, bean后置处理器执行");
        System.out.println(beanName + "::" + bean);
        return bean;
    }
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("5 bean对象初始化之后, bean后置处理器执行");
        System.out.println(beanName + "::" + bean);
        return bean;
    }
}
