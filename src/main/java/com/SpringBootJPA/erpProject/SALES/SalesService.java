package com.SpringBootJPA.erpProject.SALES;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SalesService {
    @Autowired
    private SalesRepository salesRepository;

    public List<Sales> getAllSales(){
        List<Sales> salesList = new ArrayList<>();
        salesRepository.findAll().forEach(salesList::add);
        return salesList;
    }

    public Sales getSalesById(int id){
        return salesRepository.findById(id).get();
    }

    public List<Sales> getSalesByProductionId(int production_id){
        return salesRepository.findByProductionId(production_id);
    }

    public void addSales(Sales sales){
        salesRepository.save(sales);
    }

    public void updateSales(Sales sales){
        salesRepository.save(sales);
    }

    public void deleteSales(Sales sales){
        salesRepository.delete(sales);
    }

}
