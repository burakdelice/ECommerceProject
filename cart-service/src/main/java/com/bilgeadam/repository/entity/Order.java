package com.bilgeadam.repository.entity;

import javax.persistence.*;
import java.util.Map;

@Entity
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    @ElementCollection
    private Map<String,Integer> productList;
}
