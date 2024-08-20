package com.SpringBootJPA.erpProject.INVENTORY;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InventoryRepository extends CrudRepository<Inventory,Integer> {
    List<Inventory> findByBomId(int bom_id);
    List<Inventory> findByBomName(String name);
}
