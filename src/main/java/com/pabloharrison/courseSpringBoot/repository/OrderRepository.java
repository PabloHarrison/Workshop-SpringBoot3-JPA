package com.pabloharrison.courseSpringBoot.repository;

import com.pabloharrison.courseSpringBoot.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
