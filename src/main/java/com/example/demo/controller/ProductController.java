package com.example.demo.controller;
import java.util.*;

import com.example.demo.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.services.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private ProductService productService;
  // @GetMapping("/products")
//    @GetMapping
//    public List<Map<String,Object>> getAllProducts() {
//        return Arrays.asList(
//                Map.of("name", "product 1", "price", 234),
//                Map.of("name", "product 2", "price", 134)
//        );
//    }
    @GetMapping
    public List<Product>getAllProducts(){
        return productService.getAllProducts();
    }
    @GetMapping("/category")
    public List<Map<String,Object>> getCategoryProducts(){
        return Arrays.asList(
                Map.of("harini","product 1" ),
                Map.of("geetika","product 2")
        );
    }
//    @GetMapping("/display")
//    public List<Map<String,Object>> getDisplayProducts(){
//        return Arrays.asList(
//                Map.of("name","product 1"),
//                Map.of("name","product 2")
//        );
//    }
}
