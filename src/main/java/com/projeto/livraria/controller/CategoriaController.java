package com.projeto.livraria.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.projeto.livraria.model.Categoria;
import com.projeto.livraria.model.Livros;
import com.projeto.livraria.repository.CategoriaRepository;
import com.projeto.livraria.repository.LivrosRepository;

@Controller
@RequestMapping("categorias")
public class CategoriaController {
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	@Autowired
	private LivrosRepository livrosRepository;
	
	@GetMapping("listaCategorias")
	public ModelAndView getByCategoria() {
	    List<Categoria> categorias = categoriaRepository.findAll();
	    ModelAndView mv = new ModelAndView("categorias/listaCategorias");
	    mv.addObject("categorias", categorias);
	    return mv; 
	}
	
	@GetMapping("{categoria}")
	public ModelAndView getByCategoriaLivro(@PathVariable("categoria") String categoria) {
		List <Livros> categoriaView = livrosRepository.findByCategoria(categoria);
		ModelAndView mv = new ModelAndView("mostrarLivros");
	    mv.addObject("livros", categoriaView);
	    return mv;
	}

}
	
