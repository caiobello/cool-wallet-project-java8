package com.coolwallet.repository;

import com.coolwallet.model.Cryptocurrency;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CryptocurrencyRepository extends JpaRepository<Cryptocurrency, Long> {
    // Additional custom methods if needed
}
