package com.rajat.shoppingcart.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rajat.shoppingcart.entities.Product;

import java.util.Optional;
 
public interface ProductRepo extends JpaRepository<Product, Long> {
    Optional<Product> findByCode(String code);
}