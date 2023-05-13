package com.tax.gst.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

    @GetMapping("/hello")
    public String helloworld() {
        return ("Hello ");
    }
};
