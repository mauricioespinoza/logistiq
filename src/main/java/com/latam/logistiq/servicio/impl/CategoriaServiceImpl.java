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
	/*
	 * String sql ="select * from categoria";
		List<Categoria> ListaCategorias = new ArrayList<>();
		
		try {
			pstm = conn.prepareStatement(sql);
			rs = pstm.executeQuery();
			while (rs.next()) {
				Categoria categoria = new Categoria();
				categoria.setId_categoria(rs.getInt("id_categoria"));
				categoria.setNombre_categoria(rs.getString("nombre_categoria"));
				ListaCategorias.add(categoria);
			}
		} 
		catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return ListaCategorias;
	 * */
	

	@Override
	public CategoriaVO buscarCategoria(int id) {
		return respuesta1;
		/*String sql ="select * from categoria where id_categoria = ?";
		Categoria categoria = new Categoria();
		try {
			pstm = conn.prepareStatement(sql);
			pstm.setInt(1, id_categoria);
			rs = pstm.executeQuery();
			if (rs.next()) {
				categoria.setId_categoria(rs.getInt("id_categoria"));
				categoria.setNombre_categoria(rs.getString("nombre_categoria"));
			}
		} 
		catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		return categoria;*/
	}

}
