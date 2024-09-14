package com.example.crudPractice.service.modal;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "orders")
@Getter
@Setter
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "total_price")
    private BigDecimal totalPrice;

    // Make intance have connection with anther type of instance
    @ManyToMany
    @JoinTable(
        // To create this kind of relation, need an extra table, it calls join table
        name = "order_products",
        // In general, joinColumns should point to the key of current instance
        joinColumns = @JoinColumn(name = "order_id"),
        // and inverseJoinColumns should be the key of related table
        inverseJoinColumns = @JoinColumn(name = "product_id")
    )
    private List<Product> products;
}