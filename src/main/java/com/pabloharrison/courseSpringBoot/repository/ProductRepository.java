package com.pabloharrison.courseSpringBoot.repository;

import com.pabloharrison.courseSpringBoot.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
