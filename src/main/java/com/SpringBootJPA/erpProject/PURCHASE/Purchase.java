package com.SpringBootJPA.erpProject.PURCHASE;

import com.SpringBootJPA.erpProject.BOM.BOM;
import com.SpringBootJPA.erpProject.INVENTORY.Inventory;
import jakarta.persistence.*;

@Entity
public class Purchase {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name="date")
    private String dates;
    @Column(name = "Supplier_name")
    private String name;
    private String rate;
    private String procurement;
    @ManyToOne
    private Inventory inventory;

    public Purchase() {
    }

    public Purchase(int id, String dates, String name, String rate, String procurement, int inventory_id) {
        this.id = id;
        this.dates = dates;
        this.name = name;
        this.rate = rate;
        this.procurement = procurement;
        this.inventory = new Inventory(inventory_id,"",0,0,0,0);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDates() {
        return dates;
    }

    public void setDates(String dates) {
        this.dates = dates;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public String getProcurement() {
        return procurement;
    }

    public void setProcurement(String procurement) {
        this.procurement = procurement;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }
}
