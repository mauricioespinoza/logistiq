package com.latam.logistiq.dao;

import java.util.List;

import com.latam.logistiq.modelo.Producto;
import com.latam.logistiq.modelo.cat_Producto;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CategoriaRepository extends CrudRepository<cat_Producto, Integer> {
	
    @Query(value = "select * from cat_Producto", 
    		countQuery = "SELECT count(*) FROM cat_Producto;",
    		nativeQuery = true)
    public List<cat_Producto> listarCategorias();
    
}