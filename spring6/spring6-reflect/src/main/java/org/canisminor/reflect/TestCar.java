package org.canisminor.reflect;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class TestCar {
    @Test
    public void test1() throws ClassNotFoundException, NoSuchMethodException,
            InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?> clazz1 = Car.class;
        //Class<? extends Car> clazz2 = new Car().getClass();
        Class<?> clazz3 = Class.forName("org.canisminor.reflect.Car");
        Car car = (Car) clazz3.getDeclaredConstructor().newInstance();
        System.out.println(car);
    }

    @Test
    public void test2() {
        Class<?> clazz = Car.class;
        Constructor<?>[] constructors = clazz.getConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println(constructor.getName() + Arrays.toString(constructor.getParameterTypes()));
        }
    }

    @Test
    public void test3() {
        Class<?> clazz = Car.class;
        Constructor<?>[] constructors = clazz.getDeclaredConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println(constructor.getName() + Arrays.toString(constructor.getParameterTypes()));
        }
    }

    @Test
    public void test4() throws NoSuchMethodException, InvocationTargetException,
            InstantiationException, IllegalAccessException {
        Class<?> clazz = Car.class;
        Constructor<?> constructor = clazz.getConstructor(String.class, int.class, String.class);
        System.out.println(constructor.getName() + Arrays.toString(constructor.getParameterTypes()));

        Car car = (Car) constructor.newInstance("BMW", 5, "Black");
        System.out.println(car);
    }

    @Test
    public void test5() throws NoSuchMethodException, InvocationTargetException,
            InstantiationException, IllegalAccessException {
        Class<?> clazz = Car.class;
        Constructor<?> constructor = clazz.getDeclaredConstructor(String.class, int.class, String.class);
        constructor.setAccessible(true);
        System.out.println(constructor.getName() + Arrays.toString(constructor.getParameterTypes()));

        Car car = (Car) constructor.newInstance("BMW", 5, "Black");
        System.out.println(car);
    }

    @Test
    public void test6() {
        Class<?> clazz = Car.class;
        Field[] fields1 = clazz.getFields();
        System.out.println("fields1: " + Arrays.toString(fields1));

        Field[] fields2 = clazz.getDeclaredFields();
        System.out.println("field2: " + Arrays.toString(fields2));
    }

    @Test
    public void test7() throws NoSuchMethodException, InvocationTargetException,
            InstantiationException, IllegalAccessException {
        Class<?> clazz = Car.class;
        Car car = (Car) clazz.getDeclaredConstructor().newInstance();
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            if (field.getName().equals("name")) {
                field.setAccessible(true);
                field.set(car, "BMW");
            }
        }
        System.out.println(car.getName());
    }
    
    @Test
    public void test8() throws InvocationTargetException, IllegalAccessException {
        Car car = new Car("BMW", 5, "black");
        Class<?> clazz = car.getClass();
        Method[] methods = clazz.getDeclaredMethods();
        for(Method method : methods) {
            if (method.getName().equals("run")) {
                method.setAccessible(true);
                method.invoke(car);
            }
        }
    }
}
