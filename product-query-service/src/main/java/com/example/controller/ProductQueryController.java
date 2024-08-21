package com.example.controller;

import com.example.entity.Product;
import com.example.service.ProductQueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/products")
@RestController
public class ProductQueryController {

    @Autowired
    private ProductQueryService queryService;

    @GetMapping("/all")
    public List<Product> fetchAllProducts(){
        return queryService.getProducts();
    }


}
