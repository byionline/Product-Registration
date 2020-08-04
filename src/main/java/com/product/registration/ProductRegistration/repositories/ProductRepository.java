package com.product.registration.ProductRegistration.repositories;

import com.product.registration.ProductRegistration.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
