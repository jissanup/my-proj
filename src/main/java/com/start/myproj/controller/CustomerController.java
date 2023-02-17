package com.start.myproj.controller;

import com.start.myproj.model.Customer;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
    @RestController
    public class CustomerController{

        public static List<Customer> list = new ArrayList<Customer>();
//Create Customer rest API

        @PostMapping("/api/createCustomer")
        public Customer createCustomer(@RequestBody Customer cust){
            return cust;
        }


//fetchCustomerDetails

        @GetMapping("/api/fetchCustomerDetails")
        public List<Customer> fetchCustomerDetails(){

            list.add(new Customer(1,"Amit"));
            list.add(new Customer(2,"Raj"));

            return list;
        }

        //deleteCustomer
        @DeleteMapping("/api/deleteCustomer/{id}")
        public List<Customer> deleteCustomer(@PathVariable("id") int id){

            list.add(new Customer(1,"Amit"));
            list.add(new Customer(2,"Raj"));

//            for(Customer cs: list)
//            {
//                if(cs.getId() == id){
//                    list.remove(cs);
//                }
//            }
            list.removeIf(obj->obj.getId() == id);
            return list;
        }
    }



