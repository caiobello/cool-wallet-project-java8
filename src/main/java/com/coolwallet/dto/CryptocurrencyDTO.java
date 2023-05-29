package com.coolwallet.dto;

import com.coolwallet.model.Cryptocurrency;

public class CryptocurrencyDTO {
    private Long id;
    private String name;
    private String symbol;

    public CryptocurrencyDTO() {
    }

    public CryptocurrencyDTO(Cryptocurrency cryptocurrency) {
        this.id = cryptocurrency.getId();
        this.name = cryptocurrency.getName();
        this.symbol = cryptocurrency.getSymbol();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }
}
