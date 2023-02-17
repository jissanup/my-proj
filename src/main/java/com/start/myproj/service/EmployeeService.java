package com.start.myproj.service;

import com.start.myproj.model.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> getAllEmployees();
    public List<Employee> createEmployee(Employee empl);
}
