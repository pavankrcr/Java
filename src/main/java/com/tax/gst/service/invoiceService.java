package com.tax.gst.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tax.gst.model.Invoice;
import com.tax.gst.repository.invoiceRepository;

@Service
public class invoiceService {
    @Autowired
    invoiceRepository invoiceRepository;

    public List<Invoice> getAllInvoices() {
        List<Invoice> invoices = new ArrayList<Invoice>();
        invoiceRepository.findAll().forEach(invoice1 -> invoices.add(invoice1));
        return invoices;
    };

    public Invoice getInvoiceById(Long id) {
        return invoiceRepository.findById(id).get();
    };

    public void saveOrUpdate(Invoice invoice) {
        invoiceRepository.save(invoice);

    };
};
