package com.sincrono.sio.model;

	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.Table;



	@Entity
	@Table (name="accesso")
	public class Accesso {
		
		@Id
		@GeneratedValue (strategy = GenerationType.IDENTITY)
		private Integer id_accesso;
		
		@Column(name= "username")
		private String username;
		
		@Column (name = "pass")
		private String pass;
		
		@Column (name = "id_dipendente")
		private Integer id_dipendente;
		
		@Column (name = "id_privilegio")
		private Integer id_privilegio;

		
		//COSTRUTTORE VUOTO
		public Accesso() {
			super();
		}

		
		//COSTRUTTORE CON TUTTI I CAMPI ESCLUSO ID_ACCESSO
		public Accesso(String username, String pass, Integer id_dipendente, Integer id_privilegio) {
			super();
			
			this.username = username;
			this.pass = pass;
			this.id_dipendente = id_dipendente;
			this.id_privilegio = id_privilegio;
		}

		
		//GETTER E SETTER
		public Integer getId_accesso() {
			return id_accesso;
		}

		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public String getPass() {
			return pass;
		}

		public void setPass(String pass) {
			this.pass = pass;
		}

		public Integer getId_dipendente() {
			return id_dipendente;
		}

		public void setId_dipendente(Integer id_dipendente) {
			this.id_dipendente = id_dipendente;
		}

		public Integer getId_privilegio() {
			return id_privilegio;
		}

		public void setId_privilegio(Integer id_privilegio) {
			this.id_privilegio = id_privilegio;
		}


		

	}

