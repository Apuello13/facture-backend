package com.example.app.facture.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.app.facture.entity.Factura;

public interface FacturaRepository extends JpaRepository<Factura, Long>{}
