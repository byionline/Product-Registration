package com.product.registration.ProductRegistration.controllers;

import com.product.registration.ProductRegistration.models.Product;
import com.product.registration.ProductRegistration.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController {
    //inject Product Repository into Controller
    @Autowired
    private ProductRepository productRepository;
    // Get List of Products
    @GetMapping
    public List<Product> list(){
//        List<Product> products = new ArrayList<>();
//        return  products;
        return productRepository.findAll();
    }
    // Get Product by id
    @GetMapping("/{id}")
    public Optional<Product> get(@PathVariable("id") Long id){
//        return new Product();
        return productRepository.findById(id);
    }
    
    // Create Product
    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void create(@RequestBody Product product){
        productRepository.save(product);
        
    }
}
