
package com.SpringBootJPA.erpProject.SALES;

import com.SpringBootJPA.erpProject.PRODUCTION.Production;
import jakarta.persistence.*;

@Entity
public class Sales {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "date")
    private String dates;
    private int expected_qty;
    private int sales_qty;
    @ManyToOne
    private Production production;

    public Sales() {
    }

    public Sales(int id, String dates, int expected_qty, int sales_qty, int production_id) {
        this.id = id;
        this.dates = dates;
        this.expected_qty = expected_qty;
        this.sales_qty = sales_qty;
        this.production = new Production(production_id,"",0,0,0);
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

    public int getExpected_qty() {
        return expected_qty;
    }

    public void setExpected_qty(int expected_qty) {
        this.expected_qty = expected_qty;
    }

    public int getSales_qty() {
        return sales_qty;
    }

    public void setSales_qty(int sales_qty) {
        this.sales_qty = sales_qty;
    }

    public Production getProduction() {
        return production;
    }

    public void setProduction(Production production) {
        this.production = production;
    }
}
