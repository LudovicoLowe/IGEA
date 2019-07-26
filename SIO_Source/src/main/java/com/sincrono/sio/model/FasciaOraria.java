package com.sincrono.sio.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="fascia_oraria")
public class FasciaOraria {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id_fascia_oraria;
	
	@Column (name = "fascia")
	String fascia;
	
	public FasciaOraria(int id_fascia_oraria, String fascia) {
		super();
		
		this.id_fascia_oraria = id_fascia_oraria;
		this.fascia = fascia;
	}
	
	public FasciaOraria() {}
	
	public int getId_fascia_oraria() {
		return id_fascia_oraria;
	}
	public void setId_fascia_oraria(int id_fascia_oraria) {
		this.id_fascia_oraria = id_fascia_oraria;
	}
	public String getFascia() {
		return fascia;
	}
	public void setFascia(String fascia) {
		this.fascia = fascia;
	}

}
