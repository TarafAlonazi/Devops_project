package com.example.demo.entity;


public class employee {
    
    private int empid;

    private String empName;

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public employee(int empid, String empName) {
        this.empid = empid;
        this.empName = empName;
    }
    
    public employee() {
    }

    
}
