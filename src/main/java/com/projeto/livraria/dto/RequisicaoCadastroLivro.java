package com.projeto.livraria.dto;


import com.projeto.livraria.model.Livros;

public class RequisicaoCadastroLivro {
	
	private int codlivro;
	private String titulo;
	private String autor;
	private float valor;
	private String categoria;
	
	public int getCodlivro() {
		return codlivro;
	}
	public void setCodlivro(int codlivro) {
		this.codlivro = codlivro;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	public Livros toLivro() {
		Livros livros = new Livros();
		livros.setCodlivro(codlivro);
		livros.setTitulo(titulo);
		livros.setAutor(autor);
		livros.setValor(valor);
		livros.setCategoria(categoria);
		return livros;
	}

}
