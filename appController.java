package br.edu.infnet.projetos.appClimatizadores.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class appController {
	
	
	@GetMapping(value = "/")
	public String telaIndex() {
		
		return "index";
	}
	
	
} 