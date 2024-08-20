package com.SpringBootJPA.erpProject.SALES;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SalesRepository extends CrudRepository<Sales,Integer> {
    List<Sales> findByProductionId(int production_id);
}
