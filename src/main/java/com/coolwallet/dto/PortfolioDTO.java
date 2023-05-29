package com.coolwallet.dto;

import com.coolwallet.model.Portfolio;

public class PortfolioDTO {
    private Long id;
    private String name;

    public PortfolioDTO() {
    }

    public PortfolioDTO(Portfolio portfolio) {
        this.id = portfolio.getId();
        this.name = portfolio.getName();
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
}
