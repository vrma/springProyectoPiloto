package com.capgemini.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.capgemini.model.PropiedadDto;
import com.capgemini.services.PropiedadService;


@Controller
@RequestMapping("/propiedades")
public class ControllerIvanAlejandroAlex {
	
	@Autowired
	PropiedadService service;
	
	
	@Autowired
	MessageSource messageSource;

		//Los que se encargen del login, haced que una vez pasa el control, llame a este controlador para crear la vista
		//con todas las propiedades que estan registradas en la base de datos
		@RequestMapping(value = { "/propiedades", }, method = RequestMethod.GET)
		public String listEmployees(ModelMap model) {

			List<PropiedadDto> propiedades = service.getPropiedades();
			model.addAttribute("propiedades", propiedades);
			return "propiedades";
		}

}
