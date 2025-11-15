package com.pabloharrison.courseSpringBoot.repository;

import com.pabloharrison.courseSpringBoot.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
