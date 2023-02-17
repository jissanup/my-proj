package com.start.myproj.service;

import com.start.myproj.model.Customer;
import com.start.myproj.model.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{
   public static List<Employee> list = new ArrayList<Employee>();
    @Override
    public List<Employee> getAllEmployees() {

        return list;
    }
    static {
        list.add(new Employee(1,"Amit", "add"));
        list.add(new Employee(2,"Raj", "mumbai" ));
    }
    @Override
    public List<Employee> createEmployee(Employee empl){
        list.add(empl);
        return list;
    }
}
