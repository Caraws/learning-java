package com.example.crudPractice.repository;


import com.example.crudPractice.service.modal.Order;
import com.example.crudPractice.service.modal.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface OrderRepsitory extends JpaRepository<Order, Long> {
}