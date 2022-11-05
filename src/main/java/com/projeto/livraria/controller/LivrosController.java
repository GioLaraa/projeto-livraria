package com.projeto.livraria.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.projeto.livraria.dto.RequisicaoCadastroLivro;
import com.projeto.livraria.model.Livros;
import com.projeto.livraria.repository.LivrosRepository;


@Controller
@RequestMapping("/livros")
@Transactional
public class LivrosController {
	
	@Autowired
	private LivrosRepository livrosRepository;
	
	@GetMapping("mostrarLivros")
	public ModelAndView getAllLivros() {
	    List<Livros> livros = livrosRepository.findAll();
	    ModelAndView mv = new ModelAndView("mostrarLivros");
	    mv.addObject("livros", livros);
	    return mv; 
	}
	
	
	@GetMapping("codigolivro/{codlivro}")
	public ModelAndView getByCodigoLivro(@PathVariable("codlivro") int codlivro) {
	    List <Livros> livros = livrosRepository.findByCodlivro(codlivro);
	    ModelAndView mv = new ModelAndView("mostrarLivros");
	    mv.addObject("livros", livros);
	    return mv;
	}
	
	
	@GetMapping("cadastrarLivros")
	public String cadastro() {
		return "cadastrarLivros";
	}
	
	@GetMapping("novo")
	public ModelAndView novoLivro(RequisicaoCadastroLivro requisicao) {
		Livros livros = requisicao.toLivro();
		livrosRepository.save(livros);
		ModelAndView mv = new ModelAndView("mostrarLivros");
	    mv.addObject("livros", livros);
	    return mv;
	}
	
	@GetMapping("{codlivro}")
	public String editLivro(@PathVariable("codlivro") int codlivro) {
		return "editarLivros";
	}
	
	@GetMapping("editar")
	public ModelAndView editarLivro(RequisicaoCadastroLivro requisicao) {
		Livros livros = requisicao.toLivro();
		livrosRepository.save(livros);
		ModelAndView mv = new ModelAndView("mostrarLivros");
	    mv.addObject("livros", livros);
	    return mv;
	}
	
	
	@GetMapping("delete/{codlivro}")
	public ModelAndView excluirLivro(@PathVariable("codlivro") int codlivro) {
		livrosRepository.deleteByCodlivro(codlivro);
		List<Livros> livros = livrosRepository.findAll();
	    ModelAndView mv = new ModelAndView("mostrarLivros");
	    mv.addObject("livros", livros);
	    return mv; 
	}

}
