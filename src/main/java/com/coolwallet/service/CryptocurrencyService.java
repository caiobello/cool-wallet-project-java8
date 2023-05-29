package com.coolwallet.service;

import com.coolwallet.model.Cryptocurrency;

public interface CryptocurrencyService {
    Cryptocurrency createCryptocurrency(Cryptocurrency cryptocurrency);

    Cryptocurrency getCryptocurrencyById(Long id);

    // Additional methods for cryptocurrency-related operations
}
