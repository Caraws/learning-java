package com.example.crudPractice.repository;

import com.example.crudPractice.service.modal.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
    
}