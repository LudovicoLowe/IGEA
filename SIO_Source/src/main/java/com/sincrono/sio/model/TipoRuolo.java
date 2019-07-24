package com.sincrono.sio.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "tipo_ruolo")
public class TipoRuolo {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)  
	private Integer id_tipo_ruolo;
	
	@Column(name="ruolo")
	private String ruolo;

	public TipoRuolo() {
		super();
	}

	public TipoRuolo(String ruolo) {
		super();
		this.ruolo = ruolo;
	}

	public Integer getId_tipo_ruolo() {
		return id_tipo_ruolo;
	}

	public void setId_tipo_ruolo(Integer id_tipo_ruolo) {
		this.id_tipo_ruolo = id_tipo_ruolo;
	}

	public String getRuolo() {
		return ruolo;
	}

	public void setRuolo(String ruolo) {
		this.ruolo = ruolo;
	}
	
}
