package com.example.app.facture.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.app.facture.entity.Producto;
import com.example.app.facture.repository.ProductRepository;

@RequestMapping("/producto")
@RestController
@CrossOrigin("*")
public class ProductoController {
	@Autowired
	private ProductRepository productoDao;
	
	@PostMapping
	public Producto saveProduct(@RequestBody Producto producto) {
		if(productoDao.existsByNombre(producto.getNombre()) & producto.getId() == 0) {
			return producto = null;
		}else {
			return productoDao.save(producto); 
		}
	}
}
