package com.example.app.facture.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table( name = "facturas" )
public class Factura {
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY )
	private Long id;
	@ManyToOne
	@JoinColumn( name = "id_cliente" )
	private Cliente cliente;
	@OneToMany( mappedBy = "factura" )
	private List<Detalle> detalle;
	@Temporal( TemporalType.DATE )
	private Date fecha;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public List<Detalle> getDetalle(){
		return this.detalle;
	}
}
