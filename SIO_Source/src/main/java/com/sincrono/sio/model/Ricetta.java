package com.sincrono.sio.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "ricetta")
public class Ricetta {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)  
	private Integer id_ricetta;
	
	@Column(name = "num_ricetta")
	private String num_ricetta;
	
	@Column(name = "id_tipo_esame")
	private Integer id_tipo_esame;
	
	@Column(name = "id_tipo_visita")
	private Integer id_tipo_visita;
	
	@Column(name="cod_fis")
	private String cod_fis;
	
	@Column(name="cod_esenzione")
	private String cod_esenzione;
	
	@Column(name="data")
	private String data;
	
	public Ricetta() {
		super();
	}

	public Ricetta(Integer id_ricetta, String num_ricetta, Integer id_tipo_esame, Integer id_tipo_visita,
			String cod_fis, String cod_esenzione, String data) {
		super();
		
		this.id_ricetta = id_ricetta;
		this.num_ricetta = num_ricetta;
		this.id_tipo_esame = id_tipo_esame;
		this.id_tipo_visita = id_tipo_visita;
		this.cod_fis = cod_fis;
		this.cod_esenzione = cod_esenzione;
		this.data = data;
	}

	public Integer getId_ricetta() {
		return id_ricetta;
	}

	public void setId_ricetta(Integer id_ricetta) {
		this.id_ricetta = id_ricetta;
	}

	public String getNum_ricetta() {
		return num_ricetta;
	}

	public void setNum_ricetta(String num_ricetta) {
		this.num_ricetta = num_ricetta;
	}

	public Integer getId_tipo_esame() {
		return id_tipo_esame;
	}

	public void setId_tipo_esame(Integer id_tipo_esame) {
		this.id_tipo_esame = id_tipo_esame;
	}

	public Integer getId_tipo_visita() {
		return id_tipo_visita;
	}

	public void setId_tipo_visita(Integer id_tipo_visita) {
		this.id_tipo_visita = id_tipo_visita;
	}

	public String getCod_fis() {
		return cod_fis;
	}

	public void setCod_fis(String cod_fis) {
		this.cod_fis = cod_fis;
	}

	public String getCod_esenzione() {
		return cod_esenzione;
	}

	public void setCod_esenzione(String cod_esenzione) {
		this.cod_esenzione = cod_esenzione;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
	
}
