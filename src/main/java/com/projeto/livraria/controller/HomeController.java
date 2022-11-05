package com.projeto.livraria.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.projeto.livraria.model.Livros;
import com.projeto.livraria.repository.LivrosRepository;

@Controller
public class HomeController {
	
//	@GetMapping(value = "/")
//	public String homePage() {
//		return "index";
//	}
	
	@Autowired
	private LivrosRepository livrosRepository;
	
	
	@GetMapping("/home")
	public ModelAndView home() {
	    List<Livros> livros = livrosRepository.findAll();
	    ModelAndView mv = new ModelAndView("index");
	    mv.addObject("categorias", livros);
	    return mv; 
	}   
	
}
