package com.coolwallet.service;

import com.coolwallet.model.Transaction;

public interface TransactionService {
    Transaction createTransaction(Transaction transaction);

    Transaction getTransactionById(Long id);

    // Additional methods for transaction-related operations
}
