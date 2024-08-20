package com.SpringBootJPA.erpProject.PURCHASE;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PurchaseService {
    @Autowired
    private PurchaseRepository purchaseRepository;

    public List<Purchase> getAllPurchase(){
        List<Purchase> purchaseList = new ArrayList<>();
        purchaseRepository.findAll().forEach(purchaseList::add);
        return purchaseList;
    }

    public Purchase getPurchaseById(int id){
        return purchaseRepository.findById(id).get();
    }

    public List<Purchase> getPurchaseByInventoryId(int inventory_id){
        return purchaseRepository.findByInventoryId(inventory_id);
    }

    public void addPurchase(Purchase purchase){
        purchaseRepository.save(purchase);
    }

    public void updatePurchase(Purchase purchase){
        purchaseRepository.save(purchase);
    }

    public void deletePurchase(Purchase purchase){
        purchaseRepository.delete(purchase);
    }

}
