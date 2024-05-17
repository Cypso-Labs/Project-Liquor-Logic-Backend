package com.liquorlogic.inventoryservice.service;

import com.liquorlogic.inventoryservice.entity.Stock;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

/**
 * @author Nipuna Ruwan.
 *  
 */
public interface StockService {
    List<Stock> getAllStocks();
    Optional<Stock> getStockById(UUID stockId);
    Stock createStock(Stock stock);
    boolean deleteStock(Stock stock);

    Stock findByItemId(UUID itemId);
}
