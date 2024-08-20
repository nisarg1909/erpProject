package com.SpringBootJPA.erpProject.PRODUCTION;

import com.SpringBootJPA.erpProject.INVENTORY.Inventory;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductionRepository extends CrudRepository<Production,Integer> {
    List<Production> findByBomId(int bom_id);
    List<Production> findByBomName(String name);
}
