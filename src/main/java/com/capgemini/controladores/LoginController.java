package com.capgemini.controladores;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.capgemini.model.Login;
import com.capgemini.model.Propiedad;
import com.capgemini.services.LoginService;

@Controller
@RequestMapping("/login")
public class LoginController {
	
	@Autowired
	LoginService service;
	
	@Autowired
	MessageSource messageSource;
	
	@RequestMapping(value = { "/login", }, method = RequestMethod.POST)
	public String login(ModelMap model, @ModelAttribute Login login) {
		
		String r = null;
		
		List<Login> usuarios = service.getUsuarios();
		ArrayList<Login> u = (ArrayList<Login>) usuarios;
		for(Login l : u) {
			if(l.equals(login)) {
				r ="propiedades";
			}
			
			else
				r="login";
			
			
		}
		return r;
	}

}
