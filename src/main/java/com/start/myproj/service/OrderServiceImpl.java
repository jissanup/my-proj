package com.start.myproj.service;

import com.start.myproj.model.Order;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService{
    public static List<Order> list = new ArrayList<Order>();
    @Override
    public List<Order> getAllOrders() {

        return list;
    }

    @Override
    public List<Order> createOrders(Order order) {
        return null;
    }

    static {
        list.add(new Order(1, "test"));
        list.add(new Order(2,"Raj"));
    }
    @Override
    public List<Order> createOrder(Order order){
        list.add(order);
        return list;
    }

    @Override
    public int deleteOrder(int id) {
        list.removeIf(obj->obj.getId() == id);
        return id;

    }

}
