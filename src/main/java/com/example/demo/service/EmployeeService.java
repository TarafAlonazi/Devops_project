package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.employee;

@Service
public class EmployeeService implements IEmployeeService{

    @Override
    public List<employee> findAll() {
        
        ArrayList<employee> Employees = new  ArrayList<employee>();

        Employees.add(new employee(100,"Saad Jareer"));
        Employees.add(new employee(200,"Sally"));
        Employees.add(new employee(300,"Asia"));
        Employees.add(new employee(400,"Mohaned"));
        Employees.add(new employee(500,"Fahad"));
        Employees.add(new employee(600,"Sara"));


        return Employees;
    }
    
}
