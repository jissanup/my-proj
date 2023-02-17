package com.start.myproj.controller;

import com.start.myproj.model.Order;
import com.start.myproj.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OrderController {
    @Autowired
    OrderService orderService;
    @GetMapping("/getOrderDetails")
    public List<Order> getOrders(){
        return orderService.getAllOrders();
    }
    @GetMapping("/getOrderDetails/{id}")
    public String getOrder(@PathVariable("id") int id){
        return "order id" + " " + id;
    }
    @PostMapping("/api/createOrder")
    public List<Order> createOrder(@RequestBody Order order){
        return orderService.createOrder(order);
    }
    @DeleteMapping("/api/deleteOrder/{id}")
    public String deleteOrder(@PathVariable("id") int id)
    {
        return "order removed" + " " + id;
    }
}
