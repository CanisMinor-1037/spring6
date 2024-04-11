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
}
