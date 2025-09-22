package com.jpa.gateway.service;

import com.jpa.gateway.entity.Order;
import com.jpa.gateway.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
@Autowired
    private OrderRepository orderRepository;

    public Order save(Order order) {
        return orderRepository.save(order);  // this method can perfrom it will perform insert or update.
    }
    public Order findById(Long id) {
        return orderRepository.findById(id).get();//retrives specific entity
    }
    public List<Order> findAll() {
        return orderRepository.findAll(); //all orders it will get
    }

    public void deleteById(Long id) {
        orderRepository.deleteById(id);
    }

   
}
