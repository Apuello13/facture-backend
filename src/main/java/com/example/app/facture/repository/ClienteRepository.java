package com.example.app.facture.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.app.facture.entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{
	public boolean existsByTelefonoAndEmail(String telefono, String email);
}