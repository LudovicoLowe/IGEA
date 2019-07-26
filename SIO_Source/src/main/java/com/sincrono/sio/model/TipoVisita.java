package com.sincrono.sio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tipo_visita")
public class TipoVisita {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer id_tipo_visita;
	String tipo;
	Integer id_reparto;
	
	public TipoVisita(Integer id_tipo_visita, String tipo, Integer id_reparto) {
		super();
		this.id_tipo_visita = id_tipo_visita;
		this.tipo = tipo;
		this.id_reparto = id_reparto;
	}
	
	public TipoVisita() {}

	public Integer getId_tipo_visita() {
		return id_tipo_visita;
	}

	public void setId_tipo_visita(Integer id_tipo_visita) {
		this.id_tipo_visita = id_tipo_visita;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Integer getId_reparto() {
		return id_reparto;
	}

	public void setId_reparto(Integer id_reparto) {
		this.id_reparto = id_reparto;
	}
	
}
