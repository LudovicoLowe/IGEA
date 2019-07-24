package com.sincrono.sio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tipo_esame")
public class TipoEsame {
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer id_tipo_esame;
	String tipo;
	public TipoEsame(Integer id_tipo_esame, String tipo) {
		super();
		this.id_tipo_esame = id_tipo_esame;
		this.tipo = tipo;
	}
	
	public TipoEsame() {}

	public Integer getId_tipo_esame() {
		return id_tipo_esame;
	}

	public void setId_tipo_esame(Integer id_tipo_esame) {
		this.id_tipo_esame = id_tipo_esame;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
	
	
	

}
