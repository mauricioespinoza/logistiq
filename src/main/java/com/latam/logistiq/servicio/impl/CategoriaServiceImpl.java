package com.latam.logistiq.servicio.impl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.latam.logistiq.LogistiqalApplication;
import com.latam.logistiq.dao.CategoriaRepository;
import com.latam.logistiq.modelo.Categoria;
import com.latam.logistiq.modelo.Producto;
import com.latam.logistiq.servicio.CategoriaService;
import com.latam.logistiq.vo.CategoriaVO;

@Service
public class CategoriaServiceImpl implements CategoriaService {
	
	private static final Logger log = LoggerFactory.getLogger(LogistiqalApplication.class);
	
	@Autowired
	CategoriaRepository daoCat;
	CategoriaVO respuesta1;

	@Override
	@Transactional(readOnly = true)
	public CategoriaVO listarCategoria() {
			respuesta1 = new CategoriaVO(new ArrayList<Categoria>(), "Ha ocurrido un error", "102" );
			try {
				respuesta1.setCategorias((List<Categoria>) daoCat.findAll());
				respuesta1.setMensaje(String.format("Se ha/n encontrado %d categoria/s", respuesta1.getCategorias().size()));
				respuesta1.setCodigo("0");
			} catch (Exception e) {
				log.trace("Categoria Service: Error en busqueda", e);
			}
			return respuesta1;
	}

	@Override
	public CategoriaVO buscarCategoria(int id_categoria) {
		respuesta1 = new CategoriaVO(new ArrayList<Categoria>(), "Ha ocurrido un error", "102" );
		try {
			Categoria categoria = daoCat.findById(id_categoria).get();
			respuesta1.getCategorias().add(categoria);
			respuesta1.setMensaje("");
			respuesta1.setCodigo("0");
		} catch (Exception e) {
			log.trace("Producto Service: Error en findAllByNombreAndClave", e);
		}
		return respuesta1;
	}

}
