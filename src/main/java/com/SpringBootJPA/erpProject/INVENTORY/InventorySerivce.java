package com.SpringBootJPA.erpProject.INVENTORY;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class InventorySerivce {
    @Autowired
    private InventoryRepository inventoryRepository;

    public List<Inventory> getAllInventory(){
        List<Inventory> inventoryList = new ArrayList<>();
        inventoryRepository.findAll().forEach(inventoryList::add);
        return inventoryList;
    }

    public Inventory getInventoryById(int id){
        return inventoryRepository.findById(id).get();
    }

    public List<Inventory> getInventoryByBOMId(int bom_id){
        return inventoryRepository.findByBomId(bom_id);
    }

    public List<Inventory> getInventoryByBomName(String name){
        return inventoryRepository.findByBomName(name);
    }

    public void addInventory(Inventory inventory){
        inventoryRepository.save(inventory);
    }

    public void updateInventory(Inventory inventory){
        inventoryRepository.save(inventory);
    }

    public void deleteInventory(Inventory inventory){
        inventoryRepository.delete(inventory);
    }

}
