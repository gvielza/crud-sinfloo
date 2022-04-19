package com.sinfloo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sinfloo.interfaceservices.IPersonaService;
import com.sinfloo.models.Persona;

@Controller
@RequestMapping
public class Controlador {
	@Autowired
	private IPersonaService service;

	@GetMapping("/listar")
	public String listar(Model model) {
		List<Persona> personas = service.listar();
		model.addAttribute("personas", personas);
		return "index";
	}
	@GetMapping("/new")
	public String agregar(Model model) {
	model.addAttribute("persona", new Persona());
	return "form";
	}
	@PostMapping("/save")
	public String  guardar(@Validated Persona p, Model model) {
		service.save(p);
		return "redirect:/listar";
	}
}
