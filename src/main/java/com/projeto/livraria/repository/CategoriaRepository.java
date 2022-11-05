package com.projeto.livraria.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.projeto.livraria.model.Categoria;
import com.projeto.livraria.model.Livros;

@Repository
public interface CategoriaRepository extends JpaRepository <Categoria, String> {
	

}
