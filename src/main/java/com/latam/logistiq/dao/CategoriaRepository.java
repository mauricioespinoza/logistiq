package com.latam.logistiq.dao;

import java.util.List;

import com.latam.logistiq.modelo.Categoria;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

public interface CategoriaRepository extends Repository<Categoria, Integer>,CrudRepository<Categoria, Integer> {
	
    @Query(value = "select * from Categoria", 
    		countQuery = "SELECT count(*) FROM Categoria;",
    		nativeQuery = true)
    public List<Categoria> findAll();
    
}