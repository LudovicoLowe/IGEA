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
	
	@Column(name="num_ricetta")
	private String num_ricetta;
	
	public Ricetta() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Ricetta(Integer id_ricetta, String num_ricetta, String cod_fis, String cod_esenzione, String data,
			Integer id_esame, Integer id_medico) {
		super();
		this.id_ricetta = id_ricetta;
		this.num_ricetta = num_ricetta;
		this.cod_fis = cod_fis;
		this.cod_esenzione = cod_esenzione;
		this.data = data;
		this.id_esame = id_esame;
		this.id_medico = id_medico;
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

	public Integer getId_esame() {
		return id_esame;
	}

	public void setId_esame(Integer id_esame) {
		this.id_esame = id_esame;
	}

	public Integer getId_medico() {
		return id_medico;
	}

	public void setId_medico(Integer id_medico) {
		this.id_medico = id_medico;
	}

	@Column(name="cod_fis")
	private String cod_fis;
	
	@Column(name="cod_esenzione")
	private String cod_esenzione;
	
	@Column(name="data")
	private String data;
	
	@Column(name="id_esame")
	private Integer id_esame;
	
	@Column(name="id_medico")
	private Integer id_medico;

}
