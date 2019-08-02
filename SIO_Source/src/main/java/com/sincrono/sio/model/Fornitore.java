package com.sincrono.sio.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name = "fornitore" )
public class Fornitore {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id_fornitore;
	
	@Column (name = "ragione_sociale")
	private String ragione_sociale;
	
	@Column (name = "p_iva")
	private String p_iva;
	
	@Column (name = "id_tipo_fornitore")
	private Integer id_tipo_fornitore;
	
	@Column (name = "telefono")
	private String telefono;
	
	@Column (name = "sede")
	private String sede;
	
	@Column (name = "catalogo")
	private String catalogo;
	
	public Fornitore() {}
	
	public Fornitore(Integer id_fornitore, String ragione_sociale, String p_iva, Integer id_tipo_fornitore,
			String telefono, String sede, String catalogo) {
		super();
		
		this.id_fornitore = id_fornitore;
		this.ragione_sociale = ragione_sociale;
		this.p_iva = p_iva;
		this.id_tipo_fornitore = id_tipo_fornitore;
		this.telefono = telefono;
		this.sede = sede;
		this.catalogo = catalogo;
	}

	public Integer getFornitore_id() {
		return id_fornitore;
	}

	public void setFornitore_id(Integer fornitore_id) {
		this.id_fornitore = fornitore_id;
	}

	public String getRagione_sociale() {
		return ragione_sociale;
	}

	public void setRagione_sociale(String ragione_sociale) {
		this.ragione_sociale = ragione_sociale;
	}

	public String getP_iva() {
		return p_iva;
	}

	public void setP_iva(String p_iva) {
		this.p_iva = p_iva;
	}

	public Integer getId_tipo_fornitore() {
		return id_tipo_fornitore;
	}

	public void setId_tipo_fornitore(Integer id_tipo_fornitore) {
		this.id_tipo_fornitore = id_tipo_fornitore;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getSede() {
		return sede;
	}

	public void setSede(String sede) {
		this.sede = sede;
	}

	public String getCatalogo() {
		return catalogo;
	}

	public void setCatalogo(String catalogo) {
		this.catalogo = catalogo;
	}
	
}
