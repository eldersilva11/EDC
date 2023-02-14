package br.edu.infnet.projetos.appClimatizadores.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UsuarioController {
	
	
	@GetMapping(value = "/usuario")
	public String telacadastro() {
		
		return "usuario/cadastro";
	}

	
	@PostMapping(value = "/usuario/incluir")
	public String incluir() {
		
		return "redirect:/";
	}
} 