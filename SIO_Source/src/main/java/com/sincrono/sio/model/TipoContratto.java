package com.sincrono.sio.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tipo_contratto")
public class TipoContratto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_tipo_contratto;
	
	@Column(name = "descrizione")
	private String descrizione;

	public TipoContratto(String descrizione) {
		super();
		this.descrizione = descrizione;
	}

	public TipoContratto() {
		super();
	}

	public Integer getId_tipo_contratto() {
		return id_tipo_contratto;
	}

	public void setId_tipo_contratto(Integer id_tipo_contratto) {
		this.id_tipo_contratto = id_tipo_contratto;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	
	
}
