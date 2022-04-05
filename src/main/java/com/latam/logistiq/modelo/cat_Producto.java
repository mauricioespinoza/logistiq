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
@SequenceGenerator(name="SQ_CATPROD", initialValue=1, allocationSize=1,sequenceName = "SQ_CATPROD")
public class cat_Producto {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SQ_CATPROD")
	private int id_categoria;
	private String det_categoria;
}
