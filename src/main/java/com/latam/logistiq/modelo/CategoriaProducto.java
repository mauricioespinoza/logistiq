package com.latam.logistiq.modelo;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class CategoriaProducto {
	private Categoria categoria;
	private Producto producto;
	
}
