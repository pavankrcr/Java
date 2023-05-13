package com.tax.gst.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Invoice {
    @Id
    @Column
    private int id;
    @Column
    private String invno;
    /*
     * private LocalDate invdDate;
     * private String stockName;
     * private float qty;
     * private String uom;
     * private float price;
     * private double taxableValue;
     * private float taxrate;
     * private double IGST;
     * private double CGST;
     * private double SGST;
     * private double invoiceValue;
     */

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getInvNo() {
        return invno;
    }

    public void setInvNo(String invno) {
        this.invno = invno;
    }

    /*
     * public LocalDate getInvdDate() {
     * return invdDate;
     * }
     * 
     * public void setInvdDate(LocalDate invdDate) {
     * this.invdDate = invdDate;
     * }
     * 
     * public String getStockName() {
     * return stockName;
     * }
     * 
     * public void setStockName(String stockName) {
     * this.stockName = stockName;
     * }
     * 
     * public float getQty() {
     * return qty;
     * }
     * 
     * public void setQty(float qty) {
     * this.qty = qty;
     * }
     * 
     * public String getUom() {
     * return uom;
     * }
     * 
     * public void setUom(String uom) {
     * this.uom = uom;
     * }
     * 
     * public float getPrice() {
     * return price;
     * }
     * 
     * public void setPrice(float price) {
     * this.price = price;
     * }
     * 
     * public double getTaxableValue() {
     * return taxableValue;
     * }
     * 
     * public void setTaxableValue(double taxableValue) {
     * this.taxableValue = taxableValue;
     * }
     * 
     * public float getTaxrate() {
     * return taxrate;
     * }
     * 
     * public void setTaxrate(float taxrate) {
     * this.taxrate = taxrate;
     * }
     * 
     * public double getIGST() {
     * return IGST;
     * }
     * 
     * public void setIGST(double iGST) {
     * IGST = iGST;
     * }
     * 
     * public double getCGST() {
     * return CGST;
     * }
     * 
     * public void setCGST(double cGST) {
     * CGST = cGST;
     * }
     * 
     * public double getSGST() {
     * return SGST;
     * }
     * 
     * public void setSGST(double sGST) {
     * SGST = sGST;
     * }
     * 
     * public double getInvoiceValue() {
     * return invoiceValue;
     * }
     * 
     * public void setInvoiceValue(double invoiceValue) {
     * this.invoiceValue = invoiceValue;
     * }
     */
}
