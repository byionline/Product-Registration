package com.product.registration.ProductRegistration.controllers;

import com.product.registration.ProductRegistration.models.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController {
    @GetMapping
    public List<Product> list(){
        List<Product> products = new ArrayList<>();
        return  products;
    }
}
