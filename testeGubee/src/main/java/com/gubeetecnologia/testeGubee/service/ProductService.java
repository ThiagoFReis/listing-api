package com.gubeetecnologia.testeGubee.service;

import com.gubeetecnologia.testeGubee.model.Product;
import com.gubeetecnologia.testeGubee.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> findAll() {
        return productRepository.findAll();
    }

    public Product findById(String id) {
        Optional<Product> product = productRepository.findById(id);
        return product.get();
    }

    public List<Product> findByTargetMarket(String targetMarket) {
        return productRepository.findByTargetMarketContainingIgnoreCase(targetMarket);
    }

    public List<Product> findByStack(String stack) {
        return productRepository.findByStackContainingIgnoreCase(stack);
    }

}
