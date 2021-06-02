package com.example.app.facture.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table( name = "detalles" )
public class Detalle {
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY )
	@Column( name = "num_detalle" )
	private Long id;
	@ManyToOne
	@JoinColumn( name = "id_factura" )
	private Factura factura;
	@ManyToOne
	@JoinColumn( name = "id_producto" )
	private Producto producto;
	private int cantidad;
	private Double precio;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
}
