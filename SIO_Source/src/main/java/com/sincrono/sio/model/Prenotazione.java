package com.sincrono.sio.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "prenotazione")
public class Prenotazione {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)  
	private Integer id_prenotazione;
	
	@Column(name="id_paziente")
	private Integer id_paziente;
	
	@Column(name="id_ricetta")
	private Integer id_ricetta;
	
	@Column(name="id_dipendente")
	private Integer id_dipendente;
	
	@Column(name="data")
	private String data;
	
	@Column(name="id_fascia_oraria")
	private Integer id_fascia_oraria;
	
	@Column(name="esito")
	private String esito;

	public Prenotazione(Integer id_prenotazione, Integer id_paziente, Integer id_ricetta, Integer id_dipendente,
			String data, Integer id_fascia_oraria, String esito) {
		super();
		
		this.id_prenotazione = id_prenotazione;
		this.id_paziente = id_paziente;
		this.id_ricetta = id_ricetta;
		this.id_dipendente = id_dipendente;
		this.data = data;
		this.id_fascia_oraria = id_fascia_oraria;
		this.esito = esito;
	}

	public Prenotazione() {
		super();
	}

	public Integer getId_prenotazione() {
		return id_prenotazione;
	}

	public void setId_prenotazione(Integer id_prenotazione) {
		this.id_prenotazione = id_prenotazione;
	}

	public Integer getId_paziente() {
		return id_paziente;
	}

	public void setId_paziente(Integer id_paziente) {
		this.id_paziente = id_paziente;
	}

	public Integer getId_ricetta() {
		return id_ricetta;
	}

	public void setId_ricetta(Integer id_ricetta) {
		this.id_ricetta = id_ricetta;
	}

	public Integer getId_dipendente() {
		return id_dipendente;
	}

	public void setId_dipendente(Integer id_dipendente) {
		this.id_dipendente = id_dipendente;
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
