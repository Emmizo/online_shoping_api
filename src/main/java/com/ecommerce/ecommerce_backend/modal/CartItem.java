package com.ecommerce.ecommerce_backend.modal;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode
public class CartItem {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    @JsonIgnore
    private Cart cart;
    @ManyToOne
    private Product product;
    private  String size;
    private int quantity = 1;
    private Integer mrpPrice;
    private Integer sellingPrice;
    private Long userId;
}
