package com.example.L_20_product_app;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class Product {

    private Long id;

    private String name;

    private double cost;
}
