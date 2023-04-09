package com.example.springmvc9.repos;

import com.example.springmvc9.models.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepo extends CrudRepository<Product, Integer> {
    
}
