package com.capgemini.controladores;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.capgemini.model.FormularioDto;
import com.capgemini.model.Login;
import com.capgemini.model.PropiedadDto;
import com.capgemini.services.FormularioService;
import com.capgemini.services.LoginService;
import com.capgemini.services.PropiedadService;

/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping("/")
public class HomeController {
	
	@Autowired
	private LoginService loginService;
	
	@Autowired
	private PropiedadService propiedadService;
	
	@Autowired
	private FormularioService formService;
	
	@RequestMapping(value = {"/"} , method = RequestMethod.GET)
	public String login(Model model) {
		model.addAttribute("login", new Login());
		return "login";
	}
	
	@RequestMapping(value = { "/" }, method = RequestMethod.POST)
	public String loginProcess(ModelMap model, @ModelAttribute Login login) {
		
		String r = "/";
		List<Login> usuarios = loginService.getUsuarios();
		for(Login l : usuarios) {
			if(l.equals(login)) {
				r ="propiedades";
				break;
			}			
			
		}
		return "redirect:" + r;
	}
	//Los que se encargen del login, haced que una vez pasa el control, llame a este controlador para crear la vista
	//con todas las propiedades que estan registradas en la base de datos
	@RequestMapping(value = { "/propiedades", }, method = RequestMethod.GET)
	public String listEmployees(ModelMap model) {

		List<PropiedadDto> propiedades = propiedadService.getPropiedades();
		model.addAttribute("propiedades", propiedades);
		return "propiedades";
	}
	
	@RequestMapping(value = { "/reservar-{direccion}" }, method = RequestMethod.GET)
	public String vistareservas(ModelMap model, @PathVariable String direccion) {
		FormularioDto form = new FormularioDto();
		form.setPropiedad(direccion);
		PropiedadDto p = propiedadService.getPropiedad(direccion);
		model.addAttribute("propiedad", p);
		model.addAttribute("reservas", form);
		return "reservar";

	}
	
	
	@RequestMapping(value = { "/reservar-{direccion}" }, method = RequestMethod.POST)
	public String enviareservas(ModelMap model, @PathVariable String direccion, FormularioDto reservas) {
		formService.createReserva(reservas);
		return "redirect:/propiedades";
	}
	
	
}
