package com.example.controller;

import com.example.dto.ProductEvent;
import com.example.entity.Product;
import com.example.service.ProductCommandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductCommandController {

    @Autowired
    private ProductCommandService commandService;

    @PostMapping("/create")
    public Product createProduct(@RequestBody ProductEvent productEvent) {
        return commandService.createProduct(productEvent);
    }

    @GetMapping("/allProducts")
    public List<Product> getAllProducts() {
        return commandService.getAllProducts();
    }

    @PutMapping("/{id}")
    public Product updateProduct(@PathVariable long id, @RequestBody ProductEvent productEvent) {
        return commandService.updateProduct(id, productEvent);
    }
}
