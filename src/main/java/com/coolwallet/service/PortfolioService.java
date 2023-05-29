package com.coolwallet.service;

import com.coolwallet.model.Portfolio;

import java.util.List;

public interface PortfolioService {
    Portfolio createPortfolio(Portfolio portfolio);

    Portfolio getPortfolioById(Long id);

    Portfolio updatePortfolio(Long id, Portfolio portfolio);

    void deletePortfolio(Long id);

    List<Portfolio> getAllPortfolios();

    // Additional methods for portfolio-related operations
}
