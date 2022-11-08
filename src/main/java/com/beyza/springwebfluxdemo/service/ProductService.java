package com.beyza.springwebfluxdemo.service;

import com.beyza.springwebfluxdemo.model.Product;
import com.beyza.springwebfluxdemo.repository.ProductRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Mono<Product> create(Product product) {
        return productRepository.save(product);
    }

    public Flux<Product> getAll() {
        return productRepository.findAll();
    }
}
