package com.example.app.facture.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.app.facture.entity.Detalle;
import com.example.app.facture.repository.DetalleRepository;

@RequestMapping("/detalle")
@RestController
@CrossOrigin("*")
public class DetalleContoller {
	@Autowired
	private DetalleRepository detalleDao;
	
	@PostMapping
	public Detalle saveDetalle(@RequestBody Detalle detalle) {
		return detalleDao.save(detalle);
	}
}
