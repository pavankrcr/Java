package com.tax.gst.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.tax.gst.model.Invoice;
import com.tax.gst.service.invoiceService;

@RestController
public class invoiceController {
    @Autowired
    invoiceService invService;

    @PostMapping("/Invoice")
    public int saveInvoice(@RequestBody Invoice invoice) {

        invService.saveOrUpdate(invoice);
        return invoice.getId();
    };

    @GetMapping("/Invoice")
    public List<Invoice> getAllInvoiceices() {
        return invService.getAllInvoices();
    };

    @GetMapping("/Invoice/{id}")
    @ResponseBody
    public Invoice getInvoiceById(@PathVariable Long id) {
        return invService.getInvoiceById(id);
    };


    @DeleteMapping("/Invoice/{id}")
    @ResponseBody
    public void deleteInvoice(@PathVariable Long id) {
         invService.deleteInvoiceById(id);
    };


    @GetMapping("/hello")
    public String helloworld() {
        return ("Hello ");
    }
};
