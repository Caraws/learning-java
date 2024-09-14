package com.example.crudPractice.controller;

import com.example.crudPractice.service.modal.Product;
import com.example.crudPractice.service.modal.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
public class ProductsController {
    @Autowired
    private ProductsService productsService;

    @PostMapping
    public Product createProduct(@RequestBody Product product) {
        return productsService.createProduct(product);
    }

    @GetMapping("/{id}")
    public Product getProductDetail(@PathVariable("id") long id) {
        return productsService.getProductDetail(id);
    }

    @GetMapping
    public List<Product> getAllProducts() {
        return productsService.getAllProducts();
    }
}