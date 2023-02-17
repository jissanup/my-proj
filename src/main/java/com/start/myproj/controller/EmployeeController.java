package com.start.myproj.controller;

import com.start.myproj.model.Customer;
import com.start.myproj.model.Employee;
import com.start.myproj.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
  @Autowired
    EmployeeService emplService;
   @GetMapping("/getEmployeeDetails")
    public List<Employee> getEmployee(){
       return emplService.getAllEmployees();
    }
    @GetMapping("/getEmployeeDetails/{name}")
    public String getEmployeeName(@PathVariable("name") String name){
        return "my name" + " " + name;
    }
    @PostMapping("/api/createEmployee")
    public List<Employee> createEmployee(@RequestBody Employee empl){
        return emplService.createEmployee(empl);
    }

}
