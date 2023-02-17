package com.start.myproj.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.start.myproj.model.Employee;
@RestController
public class NameController {
    @GetMapping("/getEmployeeName/{name}")
    public Employee getEmployeeName(@PathVariable("name") String name){
        Employee emp = new Employee();
        emp.setName(name);
        return emp;
    }
}
