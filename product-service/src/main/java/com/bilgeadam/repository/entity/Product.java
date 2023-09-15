package com.bilgeadam.repository.entity;

import org.springframework.data.annotation.Id;

import java.util.List;

public class Product {

    @Id
    private String id;
    private String productName;
    private String price;
    private List<String> categoryList;
    private String size;
    private String colour;
    private String description;
    private List<String> commentList;
}
