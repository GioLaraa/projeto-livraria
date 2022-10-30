package com.projeto.livraria.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Livros {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int codlivro;
	public String titulo;
	public String autor;
	public String categoria;
	public float valor;

}
