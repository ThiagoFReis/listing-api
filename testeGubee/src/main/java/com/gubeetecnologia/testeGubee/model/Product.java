package com.gubeetecnologia.testeGubee.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Document
public class Product implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    private String id;
    private String productName;
    private String description;
    private List<String> targetMarket = new ArrayList<>();
    private List<String> stack = new ArrayList<>();

    public Product(){}

    public Product(String id, String name, String description) {
        this.id = id;
        this.productName = productName;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getTargetMarket() {
        return targetMarket;
    }

    public List<String> getStack() {
        return stack;
    }
}
