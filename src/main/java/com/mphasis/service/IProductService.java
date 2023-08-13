package com.mphasis.service;

import com.mphasis.domain.Product;

import java.util.List;

public interface IProductService {

    public Product addProduct(Product product);
    public Product updateProduct(Product product);
    public List<Product> getAllProducts();
    public Product getProductById(Integer id);

    public void deleteProductById(Integer id);
    public List<Product> findByName(String name);
    public List<Product> findByBrand(String brand);
    public List<Product> findByPrice(double price);
}
