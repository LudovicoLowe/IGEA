package com.sincrono.sio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name="dimissione")
public class Dimissione {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_dimissione;
	
	
	/* MANCA ANNOTATION COLUMN PERCHE' IL NOME ASSEGNATO 
	*	PERCHE' IL NOME PROPRIETA' ASSEGNATO EQUIVALE AL NOME COLONNA
	*/
	private Integer id_ricovero;
	
	
	private String data_dimissione;
	
	
	
	

	// COSTRUTTORE VUOTO
	public Dimissione() {
		super();
	}

	
	// COSTRUTTORE TUTTI I CAMPI ESCLUSO ID_DIMISSIONE
	public Dimissione(Integer id_ricovero, String data_dimissione) {
		super();
		this.id_ricovero = id_ricovero;
		this.data_dimissione = data_dimissione;
	}


	
	// INIZIO SETTER E GETTER CAMPI
	public Integer getId_dimissione() {
		return id_dimissione;
	}


	public void setId_dimissione(Integer id_dimissione) {
		this.id_dimissione = id_dimissione;
	}


	public Integer getId_ricovero() {
		return id_ricovero;
	}


	public void setId_ricovero(Integer id_ricovero) {
		this.id_ricovero = id_ricovero;
	}


	public String getData_dimissione() {
		return data_dimissione;
	}


	public void setData_dimissione(String data_dimissione) {
		this.data_dimissione = data_dimissione;
	}
	
	
	
	

}
