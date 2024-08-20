package com.SpringBootJPA.erpProject.SALES;

import com.SpringBootJPA.erpProject.PRODUCTION.Production;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SalesController {
    @Autowired
    private SalesService salesService;

    @GetMapping("/sales")
    public List<Sales> getAllSales(){
        return salesService.getAllSales();
    }

    @GetMapping("/sales/{id}")
    public Sales getSalesById(@PathVariable("id") int id){
        return salesService.getSalesById(id);
    }

    @GetMapping("/sales/production/{production_id}")
    public List<Sales> getSalesByProductionId(@PathVariable("production_id") int production_id){
        return salesService.getSalesByProductionId(production_id);
    }

    @PostMapping("/sales/production/{production_id}")
    public String addSales(@RequestBody Sales sales, @PathVariable("production_id") int production_id){
        Production production = new Production(production_id,"",0,0,0);
        sales.setProduction(production);
        salesService.addSales(sales);
        return "Record Added Successfully";
    }

    @PutMapping("/sales/production/{production_id}")
    public String updateSales(@RequestBody Sales sales, @PathVariable("production_id") int production_id){
        Production production = new Production(production_id,"",0,0,0);
        sales.setProduction(production);
        salesService.updateSales(sales);
        return "Record Updated Successfully";
    }

    @DeleteMapping("/sales/production/{production_id}")
    public String deleteSales(@RequestBody Sales sales, @PathVariable("production_id") int production_id){
        Production production = new Production(production_id,"",0,0,0);
        sales.setProduction(production);
        salesService.deleteSales(sales);
        return "Record Deleted Successfully";
    }

}
