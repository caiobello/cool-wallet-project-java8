package com.coolwallet.service.impl;

import com.coolwallet.model.Portfolio;
import com.coolwallet.repository.PortfolioRepository;
import com.coolwallet.service.PortfolioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PortfolioServiceImpl implements PortfolioService {
    private final PortfolioRepository portfolioRepository;

    @Autowired
    public PortfolioServiceImpl(PortfolioRepository portfolioRepository) {
        this.portfolioRepository = portfolioRepository;
    }

    @Override
    public Portfolio createPortfolio(Portfolio portfolio) {
        return portfolioRepository.save(portfolio);
    }

    @Override
    public Portfolio getPortfolioById(Long id) {
        return portfolioRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Portfolio not found"));
    }

    @Override
    public Portfolio updatePortfolio(Long id, Portfolio portfolio) {
        return null;
    }

    @Override
    public void deletePortfolio(Long id) {

    }

    @Override
    public List<Portfolio> getAllPortfolios() {
        return null;
    }

    // Additional method implementations for portfolio-related operations
}
