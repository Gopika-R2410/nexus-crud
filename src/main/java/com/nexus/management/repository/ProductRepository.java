package com.nexus.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nexus.management.model.Product; // FIX: Imports Product model!

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}