package com.sincrono.sio.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="reparto")
public class Reparto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_reparto;
	@Column(name="nome")
	private String nome_reparto;
	@Column(name="n_posti_tot")
	private int numeri_postiT;
	@Column(name="n_post_disp")
	private int numeri_postiD;
	
	public Reparto() {
		super();
	}
	
	public Reparto(int id_reparto, String nome_reparto, int numeri_postiT, int numeri_postiD) {
		super();
		this.nome_reparto = nome_reparto;
		this.numeri_postiT = numeri_postiT;
		this.numeri_postiD = numeri_postiD;
	}
	
	public int getId_reparto() {
		return id_reparto;
	}
	public void setId_reparto(int id_reparto) {
		this.id_reparto = id_reparto;
	}
	public String getNome_reparto() {
		return nome_reparto;
	}
	public void setNome_reparto(String nome_reparto) {
		this.nome_reparto = nome_reparto;
	}
	public int getNumeri_postiT() {
		return numeri_postiT;
	}
	public void setNumeri_postiT(int numeri_postiT) {
		this.numeri_postiT = numeri_postiT;
	}
	public int getNumeri_postiD() {
		return numeri_postiD;
	}
	public void setNumeri_postiD(int numeri_postiD) {
		this.numeri_postiD = numeri_postiD;
	}
	
}