package com.sincrono.sio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="dipendenti")
public class Dipendenti {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_dipendenti;
	
	
	
	/* MANCA ANNOTATION COLUMN PERCHE' IL NOME ASSEGNATO 
	*	PERCHE' IL NOME PROPRIETA' ASSEGNATO EQUIVALE AL NOME COLONNA
	*/
	private Integer id_reparto;
	
	private String nome;
	private String cognome;
	
	private String cod_fis;
	
	private String telefono;
	
	private String email;
	
	private String indirizzo;
	
	private Integer id_tipo_ruolo;
	
	

	// COSTRUTTORE VUOTO
	public Dipendenti() {
		super();
	}
	
	
	// COSTRUTTORE TUTTI I CAMPI ESCLUSO ID_DIMISSIONE
	public Dipendenti(Integer id_reparto, String nome, String cognome, String cod_fis, String telefono, String email,
			String indirizzo, Integer id_tipo_ruolo) {
		super();
		this.id_reparto = id_reparto;
		this.nome = nome;
		this.cognome = cognome;
		this.cod_fis = cod_fis;
		this.telefono = telefono;
		this.email = email;
		this.indirizzo = indirizzo;
		this.id_tipo_ruolo = id_tipo_ruolo;
	}






	public Integer getId_dipendenti() {
		return id_dipendenti;
	}

	public void setId_dipendenti(Integer id_dipendenti) {
		this.id_dipendenti = id_dipendenti;
	}

	public Integer getId_reparto() {
		return id_reparto;
	}

	public void setId_reparto(Integer id_reparto) {
		this.id_reparto = id_reparto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getCod_fis() {
		return cod_fis;
	}

	public void setCod_fis(String cod_fis) {
		this.cod_fis = cod_fis;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getIndirizzo() {
		return indirizzo;
	}

	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}

	public Integer getId_tipo_ruolo() {
		return id_tipo_ruolo;
	}

	public void setId_tipo_ruolo(Integer id_tipo_ruolo) {
		this.id_tipo_ruolo = id_tipo_ruolo;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
