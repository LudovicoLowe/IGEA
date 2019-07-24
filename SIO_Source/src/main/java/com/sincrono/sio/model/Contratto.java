package com.sincrono.sio.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table (name="contratto")
public class Contratto {	
		
		@Id
		@GeneratedValue (strategy = GenerationType.IDENTITY)
		private Integer id_contratto;
		
		@Column(name= "id_tipo_contratto")
		private Integer id_tipo_contratto;
		
		@Column (name = "durata")
		private String durata;
		
		@Column (name = "stipendio")
		private Double stipendio;
		
		@Column (name = "id_dipendente")
		private Integer id_dipendente;
	
		@Column (name = "id_tipo_ruolo")
		private Integer id_tipo_ruolo;

		
		//COSTRUTTORE VUOTO
		public Contratto() {
			super();
		}
		
		
		//COSTRUTTORE CON TUTTI I CAMPI ESCLUSO ID_CONTRATTO
		public Contratto(Integer id_tipo_contratto, String durata, Double stipendio,
				Integer id_dipendente, Integer id_tipo_ruolo) {
			super();
		
			this.id_tipo_contratto = id_tipo_contratto;
			this.durata = durata;
			this.stipendio = stipendio;
			this.id_dipendente = id_dipendente;
			this.id_tipo_ruolo = id_tipo_ruolo;
		}

		
		//GETTER E SETTER
		public Integer getId_contratto() {
			return id_contratto;
		}

		public Integer getId_tipo_contratto() {
			return id_tipo_contratto;
		}

		public void setId_tipo_contratto(Integer id_tipo_contratto) {
			this.id_tipo_contratto = id_tipo_contratto;
		}

		public String getDurata() {
			return durata;
		}

		public void setDurata(String durata) {
			this.durata = durata;
		}

		public Double getStipendio() {
			return stipendio;
		}

		public void setStipendio(Double stipendio) {
			this.stipendio = stipendio;
		}

		public Integer getId_dipendente() {
			return id_dipendente;
		}

		public void setId_dipendente(Integer id_dipendente) {
			this.id_dipendente = id_dipendente;
		}

		public Integer getId_tipo_ruolo() {
			return id_tipo_ruolo;
		}

		public void setId_tipo_ruolo(Integer id_tipo_ruolo) {
			this.id_tipo_ruolo = id_tipo_ruolo;
		}
		
		
	

}
