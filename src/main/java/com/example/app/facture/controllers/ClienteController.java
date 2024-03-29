package com.example.app.facture.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
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
		if(clienteDao.existsByTelefonoAndEmail(cliente.getTelefono(), cliente.getEmail()) & cliente.getId() == 0) {
			return cliente = null;
		}else {
			return clienteDao.save(cliente);
		}
	}
}