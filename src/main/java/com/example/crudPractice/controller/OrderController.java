package com.example.crudPractice.controller;

import com.example.crudPractice.service.modal.Order;
import com.example.crudPractice.service.modal.OrderService;
import com.example.crudPractice.service.modal.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/order")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @PostMapping()
    public Order createOrder(@RequestBody Order order) {
        return orderService.createOrder(order);
    }

    @GetMapping
    public List<Order> findAllOrders() {
        return orderService.findAllOrder();
    }

    @GetMapping("/{id}")
    public Order findOrderById(Long id) {
        return orderService.findOrderById(id);
    }
}