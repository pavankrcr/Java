package com.tax.gst.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
public class Invoice {
    @Id
    private int id;

    private String invno;

    private LocalDate invdate;

    private String custname;

    private String stockname;

    private float qty;

    private String uom;

    private float price;

    private double taxablevalue;

    private float rate;

    private double IGST;

    private double CGST;

    private double SGST;

    private double totalvalue;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getInvno() {
        return invno;
    }

    public void setInvno(String invno) {
        this.invno = invno;
    }

    public LocalDate getInvdate() {
        return invdate;
    }

    public void setInvdate(LocalDate invdate) {
        this.invdate = invdate;
    }

    public String getCustname() {
        return custname;
    }

    public void setCustname(String custname) {
        this.custname = custname;
    }

    public String getStockname() {
        return stockname;
    }

    public void setStockname(String stockname) {
        this.stockname = stockname;
    }

    public float getQty() {
        return qty;
    }

    public void setQty(float qty) {
        this.qty = qty;
    }

    public String getUom() {
        return uom;
    }

    public void setUom(String uom) {
        this.uom = uom;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public double getTaxablevalue() {
        return taxablevalue;
    }

    public void setTaxablevalue(double taxablevalue) {
        this.taxablevalue = taxablevalue;
    }

    public float getRate() {
        return rate;
    }

    public void setRate(float rate) {
        this.rate = rate;
    }

    public double getIGST() {
        return IGST;
    }

    public void setIGST(double iGST) {
        IGST = iGST;
    }

    public double getCGST() {
        return CGST;
    }

    public void setCGST(double cGST) {
        CGST = cGST;
    }

    public double getSGST() {
        return SGST;
    }

    public void setSGST(double sGST) {
        SGST = sGST;
    }

    public double getTotalvalue() {
        return totalvalue;
    }

    public void setTotalvalue(double totalvalue) {
        this.totalvalue = totalvalue;
    }
}
