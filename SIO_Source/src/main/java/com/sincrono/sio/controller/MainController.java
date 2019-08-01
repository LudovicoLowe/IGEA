package com.sincrono.sio.controller;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sincrono.sio.model.TipoFornitore;
import com.sincrono.sio.model.TipoFornitoreService;

@Controller
public class MainController {
	
//	@RequestMapping(value = "loggare", method = {RequestMethod.POST, RequestMethod.GET})
//	public String login() {
//		System.out.println("TEST");
//		//
//		return "admin/admin_home";
//	}
	
	@RequestMapping(value = "log_in", method = {RequestMethod.POST, RequestMethod.GET})
	public String log_in() {
		//
		return "admin/admin_home";
	}
	
	@RequestMapping(value = "add_fornitore", method = {RequestMethod.POST, RequestMethod.GET})
	public String add_fornitore(String ragione_sociale, String p_iva) {
		
		return "admin/forniture";
	}
	
	@Autowired
	TipoFornitoreService tfs;
	
	@RequestMapping(value = "genera_form_fornitore", method = {RequestMethod.POST, RequestMethod.GET})
	public @ResponseBody String generate_form_fornitore() {
		System.out.println("TEST");
		
		String s="";
		s+="Ragione Sociale: <input name='rs' type='text' pattern='[a-zA-Z]{2,20}' required/><span class='pattern_view'>{Campo Alfabetico}</span><br/>";
		s+="Prtita Iva: <input name='pi' type='text' pattern='[0-9]{11}' required/><span class='pattern_view'>{Campo Numerico - 11 cifre}</span><br/>";
		s+="Tipo Fornitore: <select name='typo'>";
		TipoFornitore t;
		String tmp;
		List<TipoFornitore> l=tfs.findAll();
		Iterator<TipoFornitore> it=l.iterator();
		while(it.hasNext()) {
			t=it.next();
			tmp=t.getCategoria();
			s+="<option value='"+tmp+"'>"+tmp+"</option>";
		}
		s+="</select><br/>";
		s+="Telefono: +<input name='tel' type='text' pattern='[0-9]{13}' required/><span class='pattern_view'>{Campo Numerico - 13 cifre}</span><br/>";
		s+="Sede: <input name='sede' type='text' pattern='[a-zA-Z0-9,]{,30}' required/><span class='pattern_view'>{Campo Alfanumerico - massimo 30 caratteri}</span><br/>";
		s+="Link Catalogo: <input name='link_cat' type='text' maxlength='200' required/><span class='pattern_view'>{massimo 200 caratteri}</span><br/>";
		s+="<input type='submit' value='Aggiungi Fornitore'> <input type='reset' value='Resetta Campi'><br/>";
		
		return s;
	}
}
