package com.example.demo.service;

import com.example.demo.model.Product;

import java.util.List;

public interface IProductService {
    Product addProduct(Product product);
    Product updateProduct(Product product, Long id);
    void deleteProduct(Long productId);
    List<Product> getProducts();
    Product getProductById(Long id);
}
