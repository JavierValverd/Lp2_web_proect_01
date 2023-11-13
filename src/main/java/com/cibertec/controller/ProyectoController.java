package com.cibertec.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cibertec.model.Subject;
import com.cibertec.repository.ISubjectRepository;
import com.cibertec.repository.IUsuarioRepository;

@Controller
public class ProyectoController {
    
	@Autowired
	private ISubjectRepository repos;
	
	@Autowired
	private IUsuarioRepository rus;
	
	@GetMapping("/registrar")
	public String registrerSubject(@RequestParam(name = "name", required = false, defaultValue = "Subject") String name, Model model)
	{
		Subject subj = new Subject();
		subj.setIdSubject(1);
		subj.setCode("CODO102");
		subj.setName("Lenguaje de Programación II");
		subj.setLevel("Basico");
		subj.setTeacher("Victor Manuel");
		
		subj = repos.save(subj);
		
		model.addAttribute("name", subj);
		
		return "registro";
	}
	
	@GetMapping("/listar")
	public String listSubject(Model model)
	{
		model.addAttribute("lstCursos", repos.findAll());
		return "listado";
	}
	
}
