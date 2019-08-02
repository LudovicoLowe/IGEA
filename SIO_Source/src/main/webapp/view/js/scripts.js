/**
 * 
 */

	function generic_request(type, url, f){
		if (type!="" && type!=null && url!="" && url!=null) {
			var xhr=new XMLHttpRequest();
			xhr.onreadystatechange=function handler() {
				if (xhr.readyState==4 && xhr.status==200){
		            console.log(xhr.responseText);
					f(xhr.responseText);
				}
			};
			xhr.open(type, url);
			xhr.send();
		}
	}
	
	function case_dispatcher(op) {
	    switch (op) {
			case "genera_form_fornitore":
				generic_request("get", "/all_tipo_fornitore", genera_form_fornitore);
				break;
			case "genera_tabella_fornitori":
				generic_request("get", "/all_fornitori", genera_tabella_fornitori);
				break;
		}
	}
	
	function genera_form_fornitore(x) {	
		var s="", i=0, tmp, l=JSON.parse(x);
		for (; i<l.length; ++i){
			tmp=l[i].categoria;
			s+="<option value='"+tmp+"'>"+tmp+"</option>";
		}
		
		document.getElementById("typo_fornitore").innerHTML=s;
		document.getElementById("add_fornitore").style="";
	}
	
	function genera_tabella_fornitori(x) {
		var i=0, l=JSON.parse(x);
		var s="<tr><td>Ragione Sociale</td><td>Partita Iva</td><td>Tipo Fornitura</td><td>Telefono</td><td>Sede</td><td>Link Catalogo</td></tr>";
		for (; i<l.length; ++i){
			s+="<tr><td>"+l[i].ragione_sociale+"</td><td>"+l[i].p_iva+"</td><td>"+l[i].id_tipo_fornitore+"</td><td>"+l[i].telefono+"</td><td>"+l[i].sede+"</td><td>"+l[i].catalogo+"</td></tr>";
		}
		
		document.getElementById("lista_fornitori").innerHTML=s;
	}
	