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

import com.example.app.facture.entity.Cliente;
import com.example.app.facture.repository.ClienteRepository;

@RequestMapping("/cliente")
@RestController
@CrossOrigin("*")
public class ClienteController {
	@Autowired
	public ClienteRepository clienteDao;
	
	@PostMapping
	public Cliente saveCliente(@RequestBody Cliente cliente) {
		if(clienteDao.existsByTelefonoAndEmail(cliente.getTelefono(), cliente.getEmail()) & cliente.getId() != 0) {
			return clienteDao.save(cliente);
		}else {
			return cliente = null;
		}
	}
	
	@GetMapping
	public List<Cliente> findAll(){
		return clienteDao.findAll();
	}
	
	@GetMapping("/{id}")
	public Cliente GetById(@PathVariable Long id) {
		return clienteDao.findById(id).orElse(null);
	}
	
	@DeleteMapping("/{id}")
	public void deleteById(@PathVariable Long id) {
		clienteDao.deleteById(id);
	}
}