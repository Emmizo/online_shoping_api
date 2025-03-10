package com.ecommerce.ecommerce_backend.modal;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@EqualsAndHashCode
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String title;

    private String description;

    private int mrpPrice;
    private Integer sellingPrice;
    private int quantity;
    private  String color;

    @ElementCollection
    private List<String> images = new ArrayList<>();
    private int numRatings;

     @ManyToOne
     private Category category;

     @ManyToOne
     private Seller seller;
     private LocalDateTime createdAt;
     private String Sizes;

     @OneToMany(mappedBy = "product", cascade = CascadeType.ALL, orphanRemoval = true)
     private List<Review> reviews = new ArrayList<>();
}
