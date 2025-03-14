package com.shop.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne
    private User user;

    @OneToMany(mappedBy = "cart", cascade = CascadeType.ALL, orphanRemoval = true) // kdyz zmenim neco v cart itemu tak se to zmeni vsude iguess
    private Set<CartItem> cartItems = new HashSet<>();

    private double totalSellingPrice;

    private int totalItems;

    private int totalMrpPrice;

    private int discount;

    private String couponCode;
}
