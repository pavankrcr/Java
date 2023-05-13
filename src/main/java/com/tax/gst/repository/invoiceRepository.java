package com.tax.gst.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tax.gst.model.Invoice;

public interface invoiceRepository extends JpaRepository<Invoice, Long> {

}
