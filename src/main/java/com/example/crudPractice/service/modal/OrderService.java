package com.example.crudPractice.service.modal;

import com.example.crudPractice.repository.OrderRepsitory;
import java.util.List;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    @Autowired
    private OrderRepsitory orderRepsitory;

    @Transactional
    public Order createOrder(Order order) {
        return orderRepsitory.save(order);
    }

    public List<Order> findAllOrder() {
        return orderRepsitory.findAll();
    }

    public Order findOrderById(Long id) {
        return orderRepsitory.findById(id).orElse(null);
    }
}