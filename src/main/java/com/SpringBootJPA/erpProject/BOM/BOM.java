package com.SpringBootJPA.erpProject.BOM;

import jakarta.persistence.*;

@Entity
public class BOM {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "part_number")
    private int id;
    @Column(name = "part_name")
    private String name;
    private int Qty;

    public BOM() {
    }

    public BOM(int id, String name, int qty) {
        this.id = id;
        this.name = name;
        Qty = qty;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQty() {
        return Qty;
    }

    public void setQty(int qty) {
        Qty = qty;
    }
}
