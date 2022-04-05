package com.latam.logistiq.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@SequenceGenerator(name="SQ_PRODUCTO", initialValue=1, allocationSize=1,sequenceName = "SQ_PRODUCTO")
public class Producto {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SQ_PRODUCTO")
    private Integer idProducto;
    private String codigo;
    private String nombre;
    private Integer precio;
    private Integer stock;
    private String descripcion;
    private Integer tipo_producto;

}
