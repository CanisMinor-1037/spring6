package org.canisminor.spring6.aop.example;

public class CalculatorLogImpl implements Calculator {
    @Override
    public int add(int i, int j) {
        System.out.println("[LOG] add(" + i + ", " + j + ")");
        int result = i + j;
        System.out.println("方法内部 result = " + result);
        System.out.println("[LOG] result = " + result);
        return result;
    }

    @Override
    public int sub(int i, int j) {
        System.out.println("[LOG] sub(" + i + ", " + j + ")");
        int result = i - j;
        System.out.println("方法内部 result = " + result);
        System.out.println("[LOG] result = " + result);
        return result;
    }

    @Override
    public int mul(int i, int j) {
        System.out.println("[LOG] mul(" + i + ", " + j + ")");
        int result = i * j;
        System.out.println("方法内部 result = " + result);
        System.out.println("[LOG] result = " + result);
        return result;
    }

    @Override
    public int div(int i, int j) {
        System.out.println("[LOG] div(" + i + ", " + j + ")");
        int result = i / j;
        System.out.println("方法内部 result = " + result);
        System.out.println("[LOG] result = " + result);
        return result;
    }
}
