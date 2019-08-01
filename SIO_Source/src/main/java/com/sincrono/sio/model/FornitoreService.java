package com.sincrono.sio.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface FornitoreService extends JpaRepository<Fornitore, Integer>{

//	@Modifying
//  @Query( "insert into fornitore (ragione_sociale, p_iva, id_tipo_fornitore, telefono, sede, catalogo) (:ragione_sociale, :p_iva, :id_tipo_fornitore, :telefono, :sede, :catalogo)" )
//  public int addFornitore(String ragione_sociale, String p_iva, Integer id_tipo_fornitore, String telefono, String sede, String catalogo);
}
