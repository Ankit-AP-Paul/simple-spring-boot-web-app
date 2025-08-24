package org.example.simplewebapp.service;

import org.example.simplewebapp.model.Product;
import org.example.simplewebapp.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepo products;

//    private List<Product> products = new ArrayList<>(
//            Arrays.asList(
//                    new Product(101, "HP Laptop", 70000),
//                    new Product(201, "IPhone", 90000),
//                    new Product(301, "Nintendo Switch", 50000)
//            )
//    );

    public List<Product> getProducts() {
        return products.findAll();
    }

    public Product getProductById(int prodId) {
        return products.findById(prodId).orElse(new Product());
    }

    public String addProduct(Product product) {
        products.save(product);
        return "Product added successfully";
    }

    public String updateProduct(Product product) {
        products.save(product);
        return "Product updated successfully";
    }

    public String deleteProduct(int prodId) {
        products.deleteById(prodId);
        return "Product deleted successfully";
    }
}
