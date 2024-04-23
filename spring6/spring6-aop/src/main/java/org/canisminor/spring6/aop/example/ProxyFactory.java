package org.canisminor.spring6.aop.example;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class ProxyFactory {
    // 目标对象
    private Object target;
    public ProxyFactory(Object target) {
        this.target = target;
    }

    // 返回代理对象
    public Object getProxy() {
        // 动态生成代理对象的加载器
        ClassLoader loader = target.getClass().getClassLoader();
        // 目标对象实现的所有接口的Class类型数组
        Class<?>[] interfaces = target.getClass().getInterfaces();
        // 代理对象实现目标对象方法
        InvocationHandler h = new InvocationHandler() {
            // proxy: 代理对象
            // method: 需要重写目标类的方法对象
            // args: method的参数列表
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                // 方法调用之前输出
                System.out.println("[动态代理][日志] " + method.getName() + ", 参数: " + Arrays.toString(args));
                // 调用目标的方法
                Object result = method.invoke(target, args);
                // 方法调用之后输出
                System.out.println("[动态代理][日志] " + method.getName() + ", 结果: " + result);
                return result;
            }
        };
        return Proxy.newProxyInstance(loader, interfaces, h);
    }
}
