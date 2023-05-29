package com.coolwallet.repository;

import com.coolwallet.model.Portfolio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PortfolioRepository extends JpaRepository<Portfolio, Long> {
    // Additional custom methods if needed
}
