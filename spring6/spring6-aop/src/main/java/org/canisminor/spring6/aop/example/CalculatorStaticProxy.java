package org.canisminor.spring6.aop.example;

public class CalculatorStaticProxy implements Calculator{
    private Calculator calculator;
    public CalculatorStaticProxy(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public int add(int i, int j) {
        System.out.println("[LOG] add(" + i + ", " + j + ")");
        int result = calculator.add(i, j);
        System.out.println("[LOG] result = " + result);
        return result;
    }

    @Override
    public int sub(int i, int j) {
        System.out.println("[LOG] sub(" + i + ", " + j + ")");
        int result = calculator.sub(i, j);
        System.out.println("[LOG] result = " + result);
        return result;
    }

    @Override
    public int mul(int i, int j) {
        System.out.println("[LOG] mul(" + i + ", " + j + ")");
        int result = calculator.mul(i, j);
        System.out.println("[LOG] result = " + result);
        return result;
    }

    @Override
    public int div(int i, int j) {
        System.out.println("[LOG] div(" + i + ", " + j + ")");
        int result = calculator.div(i, j);
        System.out.println("[LOG] result = " + result);
        return result;
    }
}
