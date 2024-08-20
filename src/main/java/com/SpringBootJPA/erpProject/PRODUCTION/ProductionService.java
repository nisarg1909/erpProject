package com.SpringBootJPA.erpProject.PRODUCTION;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductionService {
    @Autowired
    private ProductionRepository productionRepository;

    public List<Production> getAllProduction(){
        List<Production> productionList = new ArrayList<>();
        productionRepository.findAll().forEach(productionList::add);
        return productionList;
    }

    public Production getProductionById(int id){
        return productionRepository.findById(id).get();
    }

    public List<Production> getProductionByBOMId(int bom_id){
        return productionRepository.findByBomId(bom_id);
    }

    public List<Production> getProductionByBomName(String name){
        return productionRepository.findByBomName(name);
    }

    public void addProduction(Production production){
        productionRepository.save(production);
    }

    public void updateProduction(Production production){
        productionRepository.save(production);
    }

    public void deleteProduction(Production production){
        productionRepository.delete(production);
    }

}
