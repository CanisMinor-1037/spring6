package org.canisminor.spring6.iocxml.ditest;

import java.util.Arrays;

public class Emp {
    private String ename;
    private Integer age;

    // 员工所属部门
    private Dept dept;

    // 爱好
    private String[] hobbies;

    public void work() {
        System.out.println(ename + " emp work " + age);
        dept.info();
        System.out.println("hobbies: " + Arrays.toString(hobbies));
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public String[] getHobbies() {
        return hobbies;
    }

    public void setHobbies(String[] hobbies) {
        this.hobbies = hobbies;
    }
}
