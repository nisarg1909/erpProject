package com.SpringBootJPA.erpProject.PURCHASE;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PurchaseRepository extends CrudRepository<Purchase,Integer> {
    List<Purchase> findByInventoryId(int inventory_id);
}
