package com.coolwallet.service;

import com.coolwallet.model.Portfolio;

public interface PortfolioService {
    Portfolio createPortfolio(Portfolio portfolio);

    Portfolio getPortfolioById(Long id);

    // Additional methods for portfolio-related operations
}
