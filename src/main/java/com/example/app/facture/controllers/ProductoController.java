package com.example.app.facture.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.app.facture.entity.Producto;
import com.example.app.facture.repository.ProductRepository;

@RequestMapping("/product")
@RestController
@CrossOrigin("*")
public class ProductoController {
	@Autowired
	private ProductRepository productoDao;
	
	@PostMapping
	public Producto saveProduct(@RequestBody Producto producto) {
		if(productoDao.existsByNombre(producto.getNombre()) & producto.getId() != 0) {
			return productoDao.save(producto); 
		}else {
			return producto = null;
		}
	}
	
	@GetMapping
	public List<Producto> listAll(){
		return productoDao.findAll();
	}
	
	@GetMapping("/{id}")
	public Producto getById(@PathVariable Long id) {
		return productoDao.findById(id).orElse(null);
	}
	
	@DeleteMapping("/{id}")
	public void deleteById(@PathVariable Long id) {
		productoDao.deleteById(id);
	}
}
