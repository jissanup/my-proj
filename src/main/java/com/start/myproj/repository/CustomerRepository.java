package com.start.myproj.repository;

import com.start.myproj.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public class CustomerRepository implements JpaRepository<Customer, Integer> {

}
