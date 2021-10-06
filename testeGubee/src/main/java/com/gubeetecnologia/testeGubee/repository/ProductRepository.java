package com.gubeetecnologia.testeGubee.repository;

import com.gubeetecnologia.testeGubee.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ProductRepository extends MongoRepository<Product, String> {

    List<Product> findByTargetMarketContainingIgnoreCase(String targetMarket);
    List<Product> findByStackContainingIgnoreCase(String stack);
}
