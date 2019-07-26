package com.sincrono.sio.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="paziente")
public class Paziente {
			
			@Id
			@GeneratedValue(strategy = GenerationType.IDENTITY)
			private Integer id_paziente;
			
			@Column(name="nome")
			private String nome;
			
			@Column(name="cognome")
			private String cognome;

			@Column(name="cod_fis")
			private String cod_fis;
			
			@Column(name="data_nascita")
			private String data_nascita;
			
			@Column(name="residenza")
			private String residenza;
			
			@Column(name="telefono")
			private String telefono;
			
			@Column(name="email")
			private String email;

			@Column(name = "diagnosi")
			private String diagnosi;
			
			public Paziente() {
				super();
			}

			public Paziente(Integer id_paziente, String nome, String cognome, String cod_fis, String data_nascita,
					String residenza, String telefono, String email, String diagnosi) {
				super();
				
				this.id_paziente = id_paziente;
				this.nome = nome;
				this.cognome = cognome;
				this.cod_fis = cod_fis;
				this.data_nascita = data_nascita;
				this.residenza = residenza;
				this.telefono = telefono;
				this.email = email;
				this.diagnosi = diagnosi;
			}

			public Integer getId_paziente() {
				return id_paziente;
			}

			public void setId_paziente(Integer id_paziente) {
				this.id_paziente = id_paziente;
			}

			public String getNome() {
				return nome;
			}

			public void setNome(String nome) {
				this.nome = nome;
			}

			public String getCognome() {
				return cognome;
			}

			public void setCognome(String cognome) {
				this.cognome = cognome;
			}

			public String getCod_fis() {
				return cod_fis;
			}

			public void setCod_fis(String cod_fis) {
				this.cod_fis = cod_fis;
			}

			public String getData_nascita() {
				return data_nascita;
			}

			public void setData_nascita(String data_nascita) {
				this.data_nascita = data_nascita;
			}

			public String getResidenza() {
				return residenza;
			}

			public void setResidenza(String residenza) {
				this.residenza = residenza;
			}

			public String getTelefono() {
				return telefono;
			}

			public void setTelefono(String telefono) {
				this.telefono = telefono;
			}
}
