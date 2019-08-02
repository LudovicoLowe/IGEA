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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.sincrono.sio.model.Fornitore;
import com.sincrono.sio.model.FornitoreService;
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
	
	@Autowired
	TipoFornitoreService tfs;
	
	@RequestMapping(value = "all_tipo_fornitore", method = RequestMethod.GET)
	public @ResponseBody String all_tipo_fornitore() {
		Gson gson=new Gson();
		List<TipoFornitore> l=tfs.findAll();
		String s=gson.toJson(l);
		
		return s;
	}
	
	@Autowired
	FornitoreService fs;
	
	@RequestMapping(value = "all_fornitori", method = RequestMethod.GET)
	public @ResponseBody String all_fornitori() {
		Gson gson=new Gson();
		List<Fornitore> l=fs.findAll();
		String s=gson.toJson(l);
		
		return s;
	}
	
	@RequestMapping(value = "add_fornitore", method = RequestMethod.POST)
	public @ResponseBody String add_fornitore(@RequestParam("rs") String rs,
							  @RequestParam("pi") String p_iva,
							  @RequestParam("typo") String typo,
							  @RequestParam("tel") String tel,
							  @RequestParam("sede") String sede,
							  @RequestParam("link_cat") String link_cat) {
		fs.addFornitore(rs, p_iva, tfs.findByCategoria(typo).getId_tipo_fornitore(), "+"+tel, sede, link_cat);
		String msg="Il seguente Fornitore è stato aggiunto all'archivio: "+rs;
		msg+="<br/><a href='view/admin/forniture.html'>Dajjee</a> (cit. Adelmo)<br/>";
		
		return msg;
	}
	
}
