package com.example.app.facture.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.app.facture.entity.Detalle;

public interface DetalleRepository extends JpaRepository<Detalle, Long>{}
