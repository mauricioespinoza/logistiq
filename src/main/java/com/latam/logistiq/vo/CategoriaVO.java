package com.latam.logistiq.vo;

import java.util.ArrayList;
import java.util.List;

import com.latam.logistiq.modelo.cat_Producto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class CategoriaVO extends GenericVO{
	List<cat_Producto> categorias =new ArrayList<cat_Producto>();
	
	public CategoriaVO(List<cat_Producto> categorias, String mensaje, String codigo) {
		super(mensaje, codigo);
		this.categorias = categorias;
	}

}
