package com.amunlozb.stocksservidor.repositories;

import com.amunlozb.stocksservidor.entities.Stock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StockRepository extends JpaRepository<Stock, String> {
    List<Stock> findByLocale(String zona);
}
