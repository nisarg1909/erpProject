package com.SpringBootJPA.erpProject.INVENTORY;

import com.SpringBootJPA.erpProject.BOM.BOM;
import jakarta.persistence.*;

@Entity
public class Inventory {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String dates;
    private int accepted_stock;
    private int stock_under_QC;
    private int total_stock;
    @ManyToOne
    private BOM bom;

    public Inventory() {
    }

    public Inventory(int id, String dates, int accepted_stock, int stock_under_QC, int total_stock, int bom_id) {
        this.id = id;
        this.dates = dates;
        this.accepted_stock = accepted_stock;
        this.stock_under_QC = stock_under_QC;
        this.total_stock = total_stock;
        this.bom = new BOM(bom_id,"",0);
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

    public int getAccepted_stock() {
        return accepted_stock;
    }

    public void setAccepted_stock(int accepted_stock) {
        this.accepted_stock = accepted_stock;
    }

    public int getStock_under_QC() {
        return stock_under_QC;
    }

    public void setStock_under_QC(int stock_under_QC) {
        this.stock_under_QC = stock_under_QC;
    }

    public int getTotal_stock() {
        return total_stock;
    }

    public void setTotal_stock(int total_stock) {
        this.total_stock = total_stock;
    }

    public BOM getBom() {
        return bom;
    }

    public void setBom(BOM bom) {
        this.bom = bom;
    }
}
