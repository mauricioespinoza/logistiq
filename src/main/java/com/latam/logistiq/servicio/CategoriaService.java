package com.latam.logistiq.servicio;

import com.latam.logistiq.vo.CategoriaVO;


public interface CategoriaService {
	public CategoriaVO listarCategoria();
	public CategoriaVO buscarCategoria(int id);

}
