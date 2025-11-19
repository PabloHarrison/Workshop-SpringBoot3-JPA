package com.pabloharrison.courseSpringBoot.repository;

import com.pabloharrison.courseSpringBoot.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
