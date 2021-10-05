package com.gubeetecnologia.testeGubee.repository;

import com.gubeetecnologia.testeGubee.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface ProductRepository extends MongoRepository<Product, String> {

    @Query("{''}")
    List<Product> filterProductByTargetMarket(String targetMarket);
}
