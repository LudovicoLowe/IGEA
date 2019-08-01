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

	function genera_form_fornitore(s) {
		document.getElementById("add_fornitore").innerHTML=s;
	}
	
	function case_dispatcher(op) {
	    switch (op) {
			case "genera_form_fornitore":
				generic_request("get", "/"+op, genera_form_fornitore);
				break;
		}
	}
	