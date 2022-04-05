package com.latam.logistiq.servicio;

import java.util.List;

import com.latam.logistiq.modelo.CategoriaProducto;
import com.latam.logistiq.modelo.Producto;
import com.latam.logistiq.modelo.cat_Producto;
import com.latam.logistiq.vo.CategoriaVO;
import com.latam.logistiq.vo.NumberVO;
import com.latam.logistiq.vo.ProductoVO;

public interface ProductoService {
	public ProductoVO findAll();
	public ProductoVO add(Producto producto);
	public ProductoVO update(Producto producto);
	public ProductoVO delete(Producto producto);
	public ProductoVO findById(Integer id);
	public ProductoVO getPage(Integer pagina, Integer cantidad, String busqueda);
	public NumberVO getPageCount(long registrosPorPagina);
	public CategoriaVO listarCategoria();
}

