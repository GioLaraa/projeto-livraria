package com.projeto.livraria.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="tblivros")
public class Livros {
	
	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int codlivro;
	@Column
	private String titulo;
	@Column
	private String autor;
	@Column
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

}
