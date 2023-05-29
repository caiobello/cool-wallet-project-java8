package com.coolwallet.repository;

import com.coolwallet.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users, Long> {
    // Additional custom methods if needed
}
