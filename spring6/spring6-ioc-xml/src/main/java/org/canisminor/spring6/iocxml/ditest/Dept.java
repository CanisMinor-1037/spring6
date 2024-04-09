package org.canisminor.spring6.iocxml.ditest;

import java.util.List;

public class Dept {
    private String dname;

    private List<Emp> empList;

    public void info() {
        System.out.println("dname: " + dname);
        for(Emp emp : empList) {
            System.out.println("ename: " + emp.getEname());
        }
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public List<Emp> getEmpList() {
        return empList;
    }

    public void setEmpList(List<Emp> empList) {
        this.empList = empList;
    }
}
