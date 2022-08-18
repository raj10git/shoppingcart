package com.rajat.shoppingcart.services;

import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rajat.shoppingcart.entities.Product;
import com.rajat.shoppingcart.repositories.ProductRepo;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
@Slf4j
public class ProductService {
    
    private final ProductRepo productRepository;

    @Autowired
    public ProductService(ProductRepo productRepository) {
        this.productRepository = productRepository;
    }
 
    public List<Product> findAllProducts() {
        return productRepository.findAll();
    }
 
    public Optional<Product> findProductByCode(String code) {
        return productRepository.findByCode(code);
    }
}