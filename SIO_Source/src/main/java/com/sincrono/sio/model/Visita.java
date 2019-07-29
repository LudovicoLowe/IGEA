package com.sincrono.sio.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "visita")
public class Visita {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)  
	private Integer id_visita;
	
	@Column(name="id_paziente")
	private Integer id_paziente;

	@Column(name="id_reparto")
	private Integer id_reparto;
	
	@Column(name="id_ricetta")
	private Integer id_ricetta;
	
	@Column(name="data")
	private String data;
	
	@Column(name="id_fascia_oraria")
	private Integer id_fascia_oraria;
	
	@Column(name="esito")
	private String esito;

	public Visita(Integer id_paziente, Integer id_reparto, Integer id_ricetta, String data, Integer id_fascia_oraria,
			String esito) {
		super();
		this.id_paziente = id_paziente;
		this.id_reparto = id_reparto;
		this.id_ricetta = id_ricetta;
		this.data = data;
		this.id_fascia_oraria = id_fascia_oraria;
		this.esito = esito;
		
	
	}

	public Visita() {
		super();
	}

	public Integer getId_visita() {
		return id_visita;
	}

	public void setId_visita(Integer id_visita) {
		this.id_visita = id_visita;
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

	public Integer getId_ricetta() {
		return id_ricetta;
	}

	public void setId_ricetta(Integer id_ricetta) {
		this.id_ricetta = id_ricetta;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public Integer getId_fascia_oraria() {
		return id_fascia_oraria;
	}

	public void setId_fascia_oraria(Integer id_fascia_oraria) {
		this.id_fascia_oraria = id_fascia_oraria;
	}

	public String getEsito() {
		return esito;
	}

	public void setEsito(String esito) {
		this.esito = esito;
	}
	
	
	
	
	
	
}
