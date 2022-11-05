package com.projeto.livraria.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.projeto.livraria.model.Livros;

@Repository
public interface LivrosRepository extends JpaRepository<Livros, Integer>{
	

	@Query(nativeQuery = true, value = "select codlivro, titulo, autor, valor, categoria from tblivros where categoria like (:categoria)")
	public List <Livros> findByCategoria(String categoria);
	
	@Query(nativeQuery = true, value = "select codlivro, titulo, autor, valor, categoria from tblivros where codlivro = (:codlivro)")
	public List <Livros> findByCodlivro(int codlivro);
	
	
	public List <Livros> deleteByCodlivro(int codlivro);
	
	@Modifying
	@Query(nativeQuery = true, value = "UPDATE tblivros t SET t.titulo=:titulo, t.autor=:autor, t.categoria=:categoria, t.valor=:valor WHERE codlivro = :codlivro")
	public void updateByCodlivro(@Param("codlivro") int codlivro, @Param("titulo") String titulo, @Param("autor") String autor, @Param("categoria") String categoria, @Param("valor") String valor);
	


}
