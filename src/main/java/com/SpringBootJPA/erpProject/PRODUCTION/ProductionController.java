package com.SpringBootJPA.erpProject.PRODUCTION;

import com.SpringBootJPA.erpProject.BOM.BOM;
import com.SpringBootJPA.erpProject.INVENTORY.Inventory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductionController {
    @Autowired
    private ProductionService productionService;

    @GetMapping("/production")
    public List<Production> getAllProduction(){
        return productionService.getAllProduction();
    }

    @GetMapping("/production/{id}")
    public Production getProductionById(int id){
        return productionService.getProductionById(id);
    }

    @GetMapping("/production/bom/{bom_id}")
    public List<Production> getProductionByBomId(@PathVariable("bom_id") int bom_id){
        return productionService.getProductionByBOMId(bom_id);
    }

    @GetMapping("/production/bom/name/{name}")
    public List<Production> getProductionByBomName(@PathVariable("name") String name){
        return productionService.getProductionByBomName(name);
    }

    @PostMapping("/production/bom/{bom_id}")
    public String addProduction(@RequestBody Production production, @PathVariable("bom_id") int bom_id){
        BOM bom = new BOM(bom_id,"",0);
        production.setBom(bom);
        productionService.addProduction(production);
        return "Record Added Successfully";
    }

    @PutMapping("/production/bom/{bom_id}")
    public String updateProduction(@RequestBody Production production, @PathVariable("bom_id") int bom_id){
        BOM bom = new BOM(bom_id,"",0);
        production.setBom(bom);
        productionService.updateProduction(production);
        return "Record Updated Successfully";
    }

    @DeleteMapping("/production/bom/{bom_id}")
    public String deleteProduction(@RequestBody Production production, @PathVariable("bom_id") int bom_id){
        BOM bom = new BOM(bom_id,"",0);
        production.setBom(bom);
        productionService.deleteProduction(production);
        return "Record Deleted Successfully";
    }

}
