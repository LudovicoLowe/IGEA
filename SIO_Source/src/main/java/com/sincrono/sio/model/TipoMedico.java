package com.sincrono.sio.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


	@Entity
	@Table(name="tipo_medico")
	public class TipoMedico {
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Integer id_medico;
		
		@Column(name="tipo")
		private String tipo;

			
		public TipoMedico() {
			super();
		}

		public TipoMedico(Integer id_medico, String tipo) {
			super();
			this.id_medico = id_medico;
			this.tipo = tipo;
		}

		public Integer getId_medico() {
			return id_medico;
		}

		public void setId_medico(Integer id_medico) {
			this.id_medico = id_medico;
		}

		public String getTipo() {
			return tipo;
		}

		public void setTipo(String tipo) {
			this.tipo = tipo;
		}
		
}
