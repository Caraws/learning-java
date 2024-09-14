package com.example.crudPractice.service.modal;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Entity
@Table(name = "products")
@Getter
@Setter
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private BigDecimal price;

    @Column(name = "expired_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date expiredTime;


    @ManyToMany(mappedBy = "products")
    private List<Order> orders = new ArrayList<>();
}