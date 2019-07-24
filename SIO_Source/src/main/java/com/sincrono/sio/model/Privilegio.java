package com.sincrono.sio.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="privilegio")
public class Privilegio {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_privilegio;
	@Column(name="tipo")
	private String tipo_privilegio;
	@Column(name="descr")
	private String descrizione;
	
	public Privilegio() {
		super();
	}
	
	public Privilegio(int id_privilegio, String tipo_privilegio, String descrizione) {
		super();
		this.tipo_privilegio = tipo_privilegio;
		this.descrizione = descrizione;
	}
	
	public int getIdPrivilegio() {
		return id_privilegio;
	}
	public void setIdPrivilegio(int id_privilegio) {
		this.id_privilegio = id_privilegio;
	}
	public String getTipoPrivilegio() {
		return tipo_privilegio;
	}
	public void setTipoPrivilegio(String tipo_privilegio) {
		this.tipo_privilegio = tipo_privilegio;
	}
	public String getDescrizione() {
		return descrizione;
	}
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
}
