package com.latam.logistiq.vo;

import java.util.ArrayList;
import java.util.List;

import com.latam.logistiq.modelo.Categoria;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class CategoriaVO extends GenericVO{
	List<Categoria> categorias =new ArrayList<Categoria>();
	
	public CategoriaVO(List<Categoria> categorias, String mensaje, String codigo) {
		super(mensaje, codigo);
		this.categorias = categorias;
	}

}
