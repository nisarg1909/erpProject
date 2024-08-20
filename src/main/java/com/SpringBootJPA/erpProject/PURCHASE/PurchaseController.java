package com.SpringBootJPA.erpProject.PURCHASE;

import com.SpringBootJPA.erpProject.INVENTORY.Inventory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PurchaseController {
    @Autowired
    private PurchaseService purchaseService;

    @GetMapping("purchase")
    public List<Purchase> getPurchase(){
        return purchaseService.getAllPurchase();
    }

    @GetMapping("purchase/{id}")
    public Purchase getPurchaseById(@PathVariable("id") int id){
        return purchaseService.getPurchaseById(id);
    }

    @GetMapping("purchase/inventory/{inventory_id}")
    public List<Purchase> getPurchaseByInventoryId(@PathVariable("inventory_id") int inventory_id){
        return purchaseService.getPurchaseByInventoryId(inventory_id);
    }

    @PostMapping("purchase/inventory/{inventory_id}")
    public String addPurchase(@RequestBody Purchase purchase,@PathVariable("inventory_id") int inventory_id){
        Inventory inventory = new Inventory(inventory_id,"",0,0,0,0);
        purchase.setInventory(inventory);
        purchaseService.addPurchase(purchase);
        return "Record Added Successfully";
    }

    @PutMapping("purchase/inventory/{inventory_id}")
    public String updatePurchase(@RequestBody Purchase purchase,@PathVariable("inventory_id") int inventory_id){
        Inventory inventory = new Inventory(inventory_id,"",0,0,0,0);
        purchase.setInventory(inventory);
        purchaseService.updatePurchase(purchase);
        return "Record Updated Successfully";
    }

    @DeleteMapping("purchase/inventory/{inventory_id}")
    public String deletePurchase(@RequestBody Purchase purchase,@PathVariable("inventory_id") int inventory_id){
        Inventory inventory = new Inventory(inventory_id,"",0,0,0,0);
        purchase.setInventory(inventory);
        purchaseService.deletePurchase(purchase);
        return "Record Deleted Successfully";
    }


}
