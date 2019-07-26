package com.sincrono.sio.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "ricovero")
public class Ricovero {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)  
	private Integer id_ricovero;
	
	@Column(name="id_paziente")
	private Integer id_paziente;
	
	@Column(name="id_reparto")
	private Integer id_reparto;
	
	@Column(name="data_ricovero")
	private String data_ricovero;
	
	@Column(name="data_dimissione")
	private String data_dimissione;
	
	@Column(name="dimesso")
	private Integer dimesso;

	public Ricovero() {
		super();
	}

	public Ricovero(Integer id_ricovero, Integer id_paziente, Integer id_reparto, String data_ricovero,
			String data_dimissione, Integer dimesso) {
		super();
		
		this.id_ricovero = id_ricovero;
		this.id_paziente = id_paziente;
		this.id_reparto = id_reparto;
		this.data_ricovero = data_ricovero;
		this.data_dimissione = data_dimissione;
		this.dimesso = dimesso;
	}

	public Integer getId_ricovero() {
		return id_ricovero;
	}

	public void setId_ricovero(Integer id_ricovero) {
		this.id_ricovero = id_ricovero;
	}

	public Integer getId_paziente() {
		return id_paziente;
	}

	public void setId_paziente(Integer id_paziente) {
		this.id_paziente = id_paziente;
	}

	public Integer getId_reparto() {
		return id_reparto;
	}

	public void setId_reparto(Integer id_reparto) {
		this.id_reparto = id_reparto;
	}

	public String getData_ricovero() {
		return data_ricovero;
	}

	public void setData_ricovero(String data_ricovero) {
		this.data_ricovero = data_ricovero;
	}

	public String getData_dimissione() {
		return data_dimissione;
	}

	public void setData_dimissione(String data_dimissione) {
		this.data_dimissione = data_dimissione;
	}

	public Integer getDimesso() {
		return dimesso;
	}

	public void setDimesso(Integer dimesso) {
		this.dimesso = dimesso;
	}

}
