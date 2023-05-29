package com.coolwallet.repository;

import com.coolwallet.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<Users, Long> {
    Optional<Object> findByUsername(String username);
    // Additional custom methods if needed
}
