package com.coolwallet.controller;

import com.coolwallet.model.Cryptocurrency;
import com.coolwallet.service.CryptocurrencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/cryptocurrencies")
public class CryptocurrencyController {
    private final CryptocurrencyService cryptocurrencyService;

    @Autowired
    public CryptocurrencyController(CryptocurrencyService cryptocurrencyService) {
        this.cryptocurrencyService = cryptocurrencyService;
    }

    @PostMapping
    public ResponseEntity<Cryptocurrency> createCryptocurrency(@RequestBody Cryptocurrency cryptocurrency) {
        Cryptocurrency createdCryptocurrency = cryptocurrencyService.createCryptocurrency(cryptocurrency);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdCryptocurrency);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cryptocurrency> getCryptocurrencyById(@PathVariable Long id) {
        Cryptocurrency cryptocurrency = cryptocurrencyService.getCryptocurrencyById(id);
        return ResponseEntity.ok(cryptocurrency);
    }

    // Additional endpoint mappings and methods for cryptocurrency-related operations
}
