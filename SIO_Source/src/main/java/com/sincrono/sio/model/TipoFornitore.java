package com.sincrono.sio.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tipo_contratto")
public class TipoFornitore {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_tipo_fornitore;
	
	@Column(name = "categoria")
	private String categoria;

	public TipoFornitore(String categoria) {
		super();
		this.categoria = categoria;
	}

	public TipoFornitore() {
		super();
	}

	public Integer getId_tipo_fornitore() {
		return id_tipo_fornitore;
	}

	public void setId_tipo_fornitore(Integer id_tipo_fornitore) {
		this.id_tipo_fornitore = id_tipo_fornitore;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	
}
