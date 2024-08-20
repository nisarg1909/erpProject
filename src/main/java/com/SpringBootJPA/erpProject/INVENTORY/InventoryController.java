package com.SpringBootJPA.erpProject.INVENTORY;

import com.SpringBootJPA.erpProject.BOM.BOM;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class InventoryController {
    @Autowired
    private InventorySerivce inventorySerivce;

    @GetMapping("/inventory")
    public List<Inventory> getAllInventory(){
        return inventorySerivce.getAllInventory();
    }

    @GetMapping("/inventory/{id}")
    public Inventory getInventoryById(int id){
        return inventorySerivce.getInventoryById(id);
    }

    @GetMapping("/inventory/bom/{bom_id}")
    public List<Inventory> getInventoryByBOMId(@PathVariable("bom_id") int bom_id){
        return inventorySerivce.getInventoryByBOMId(bom_id);
    }

    @GetMapping("/inventory/bom/name/{name}")
    public List<Inventory> getInventoryByBomName(@PathVariable("name") String name){
        return inventorySerivce.getInventoryByBomName(name);
    }

    @PostMapping("/inventory/bom/{bom_id}")
    public String addInventory(@RequestBody Inventory inventory,@PathVariable("bom_id") int bom_id){
        int total = inventory.getAccepted_stock()+ inventory.getStock_under_QC();
        inventory.setTotal_stock(total);
        BOM bom = new BOM(bom_id,"",0);
        inventory.setBom(bom);
        inventorySerivce.addInventory(inventory);
        return "Record Added Successfully";
    }

    @PutMapping("/inventory/bom/{bom_id}")
    public String updateInventory(@RequestBody Inventory inventory,@PathVariable("bom_id") int bom_id){
        BOM bom = new BOM(bom_id,"",0);
        inventory.setBom(bom);
        inventorySerivce.updateInventory(inventory);
        return "Record Updated Successfully";
    }

    @DeleteMapping("/inventory/bom/{bom_id}")
    public String deleteInventory(@RequestBody Inventory inventory,@PathVariable("bom_id") int bom_id){
        BOM bom = new BOM(bom_id,"",0);
        inventory.setBom(bom);
        inventorySerivce.deleteInventory(inventory);
        return "Record Deleted Successfully";
    }

}
