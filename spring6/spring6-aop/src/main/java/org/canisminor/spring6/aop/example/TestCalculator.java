package org.canisminor.spring6.aop.example;

import org.junit.jupiter.api.Test;

public class TestCalculator {
    @Test
    public void testCalculator() {
        CalculatorImpl calculator = new CalculatorImpl();
        CalculatorStaticProxy calculatorStaticProxy = new CalculatorStaticProxy(calculator);

        calculatorStaticProxy.add(1, 2);
        calculatorStaticProxy.sub(3, 2);
        calculatorStaticProxy.mul(2, 3);
        calculatorStaticProxy.div(4, 2);
    }

    @Test
    public void testCalculator2() {
        ProxyFactory proxyFactory = new ProxyFactory(new CalculatorImpl());
        Calculator proxy = (Calculator) proxyFactory.getProxy();
        proxy.add(1, 2);
        proxy.sub(3, 2);
        proxy.mul(3, 5);
        proxy.div(6, 3);
    }
}
