package com.sincrono.sio.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name = "lista_attesa" )
public class ListaAttesa {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer fornitore_id;
	
	@Column (name = "id_paziente")
	private Integer id_paziente;
	
	@Column (name = "id_reparto")
	private Integer id_reparto;
	
	public ListaAttesa() {}
	
	public ListaAttesa(Integer fornitore_id, Integer id_paziente, Integer id_reparto) {
		super();
		
		this.fornitore_id = fornitore_id;
		this.id_paziente = id_paziente;
		this.id_reparto = id_reparto;
	}

	public Integer getFornitore_id() {
		return fornitore_id;
	}

	public void setFornitore_id(Integer fornitore_id) {
		this.fornitore_id = fornitore_id;
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
	
}
