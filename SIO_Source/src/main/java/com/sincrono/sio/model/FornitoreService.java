package com.sincrono.sio.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

public interface FornitoreService extends JpaRepository<Fornitore, Integer>{

	@Modifying
	@Query(value = "insert into Fornitore (ragione_sociale, p_iva, id_tipo_fornitore, telefono, sede, catalogo) values (?1, ?2, ?3, ?4, ?5, ?6)", nativeQuery = true)
	@Transactional
	public void addFornitore(String ragione_sociale, String p_iva, Integer id_tipo_fornitore, String telefono, String sede, String catalogo);
}
