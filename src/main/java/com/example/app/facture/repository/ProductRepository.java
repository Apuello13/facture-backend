package com.example.app.facture.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.app.facture.entity.Producto;

public interface ProductRepository extends JpaRepository<Producto, Long>{
	public boolean existsByNombre(String nombre);
}
