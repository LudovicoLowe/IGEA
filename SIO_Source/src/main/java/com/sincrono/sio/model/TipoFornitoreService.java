package com.sincrono.sio.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface TipoFornitoreService extends JpaRepository<TipoFornitore, Integer> {

	@Query("from TipoFornitore where categoria = ?1")
	TipoFornitore findByCategoria(String typo);

}
