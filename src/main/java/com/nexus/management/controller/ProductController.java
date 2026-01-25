package com.nexus.management.controller;

import com.nexus.management.model.Product;
import com.nexus.management.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
@CrossOrigin(origins = "*") // Allows the frontend to connect
public class ProductController {

    @Autowired
    private ProductRepository repo;

    @GetMapping
    public List<Product> getAll() { return repo.findAll(); }

    @PostMapping
    public Product save(@RequestBody Product p) { return repo.save(p); }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { repo.deleteById(id); }
}