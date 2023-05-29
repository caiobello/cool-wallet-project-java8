package com.coolwallet.repository;

import com.coolwallet.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
    // Additional custom methods if needed
}
