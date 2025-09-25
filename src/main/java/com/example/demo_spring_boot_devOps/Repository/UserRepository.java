package com.example.demo_spring_boot_devops.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo_spring_boot_devops.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
