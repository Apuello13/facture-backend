package com.example.app.facture.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.app.facture.entity.Factura;
import com.example.app.facture.repository.FacturaRepository;

@RequestMapping("/factura")
@CrossOrigin("*")
@RestController
public class FacturaController {
	
	@Autowired
	private FacturaRepository facuraDao;
	
	@PostMapping
	public Factura saveFactra(@RequestBody Factura factura) {
		return this.facuraDao.save(factura);
	}
}
