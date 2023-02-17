package com.start.myproj.service;

import com.start.myproj.model.Order;

import java.util.List;

public interface OrderService {
    public List<Order> getAllOrders();
    public List<Order> createOrders(Order order);

    List<Order> createOrder(Order order);
    int deleteOrder(int id);
}
