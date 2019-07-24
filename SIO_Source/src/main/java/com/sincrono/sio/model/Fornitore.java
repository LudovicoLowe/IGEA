package com.sincrono.sio.model;

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
	private Integer fornitore_id;
	
	private String ragione_sociale;
	private String p_iva;
	private Integer id_tipo_fornitore;
	private String telefono;
	private String sede;
	private String catalogo;
	
	public Fornitore() {
		
	}
	
	public Fornitore(Integer fornitore_id, String ragione_sociale, String p_iva, Integer id_tipo_fornitore,
			String telefono, String sede, String catalogo) {
		super();
		this.fornitore_id = fornitore_id;
		this.ragione_sociale = ragione_sociale;
		this.p_iva = p_iva;
		this.id_tipo_fornitore = id_tipo_fornitore;
		this.telefono = telefono;
		this.sede = sede;
		this.catalogo = catalogo;
	}

	public Integer getFornitore_id() {
		return fornitore_id;
	}

	public void setFornitore_id(Integer fornitore_id) {
		this.fornitore_id = fornitore_id;
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
