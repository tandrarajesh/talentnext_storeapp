package com.mphasis.repository;

import com.mphasis.domain.Product;
import org.springframework.context.annotation.Scope;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository(value = "productRepository")
@Scope(value = "singleton")
public interface ProductRepository extends JpaRepository<Product, Integer> {

    List<Product> findByName(String name);
    List<Product> findByBrand(String brand);
    List<Product> findByPrice(double price);
}
