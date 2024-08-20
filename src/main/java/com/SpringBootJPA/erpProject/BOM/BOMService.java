package com.SpringBootJPA.erpProject.BOM;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BOMService {
    @Autowired
    private BOMRepository bomRepository;

    public List<BOM> getBOM(){
        List<BOM> bomList = new ArrayList<>();
        bomRepository.findAll().forEach(bomList::add);
        return bomList;
    }

    public BOM getBOMById(int id){
        return bomRepository.findById(id).get();
    }

    public List<BOM> getBOMbyName(String name){
        return bomRepository.findByName(name);
    }

    public void addBOM(BOM bom){
         bomRepository.save(bom);
    }

    public void updateBOM(BOM bom){
         bomRepository.save(bom);
    }

    public void deleteBOM(BOM bom){
         bomRepository.delete(bom);
    }


}
