package com.example.microservices.currency_exchange_service;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CurrencyExchangeRepository extends JpaRepository<CurrencyExchange,Long> {
    // CurrencyExchange findbyFromAndTo(String from, String to);
    CurrencyExchange findByFromAndTo(String from ,String to);
}
