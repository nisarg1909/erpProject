package com.SpringBootJPA.erpProject.BOM;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BOMRepository extends CrudRepository<BOM,Integer> {
    List<BOM> findByName(String name);
}
