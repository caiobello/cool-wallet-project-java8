package com.coolwallet.service.impl;

import com.coolwallet.model.Cryptocurrency;
import com.coolwallet.repository.CryptocurrencyRepository;
import com.coolwallet.service.CryptocurrencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CryptocurrencyServiceImpl implements CryptocurrencyService {
    private final CryptocurrencyRepository cryptocurrencyRepository;

    @Autowired
    public CryptocurrencyServiceImpl(CryptocurrencyRepository cryptocurrencyRepository) {
        this.cryptocurrencyRepository = cryptocurrencyRepository;
    }

    @Override
    public Cryptocurrency createCryptocurrency(Cryptocurrency cryptocurrency) {
        return cryptocurrencyRepository.save(cryptocurrency);
    }

    @Override
    public Cryptocurrency getCryptocurrencyById(Long id) {
        return cryptocurrencyRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Cryptocurrency not found"));
    }

    // Additional method implementations for cryptocurrency-related operations
}
