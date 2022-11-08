package com.beyza.springwebfluxdemo.controller;

import com.beyza.springwebfluxdemo.model.Product;
import com.beyza.springwebfluxdemo.service.ProductService;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/v1/product")
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping
    public Mono<Product> create(@RequestBody Product product){
        return productService.create(product);
    }

    @GetMapping
    public Flux<Product> getAllProducts(){
        return productService.getAll();
    }
}
