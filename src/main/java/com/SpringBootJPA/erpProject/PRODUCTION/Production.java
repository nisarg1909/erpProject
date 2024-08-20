package com.SpringBootJPA.erpProject.PRODUCTION;

import com.SpringBootJPA.erpProject.BOM.BOM;
import jakarta.persistence.*;

@Entity
public class Production {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "date")
    private String dates;
    private int wip_qty;
    private int finished_qty;
    @ManyToOne
    private BOM bom;

    public Production() {
    }

    public Production(int id, String dates, int wip_qty, int finished_qty, int bom_id) {
        this.id = id;
        this.dates = dates;
        this.wip_qty = wip_qty;
        this.finished_qty = finished_qty;
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

    public int getWip_qty() {
        return wip_qty;
    }

    public void setWip_qty(int wip_qty) {
        this.wip_qty = wip_qty;
    }

    public int getFinished_qty() {
        return finished_qty;
    }

    public void setFinished_qty(int finished_qty) {
        this.finished_qty = finished_qty;
    }

    public BOM getBom() {
        return bom;
    }

    public void setBom(BOM bom) {
        this.bom = bom;
    }
}
