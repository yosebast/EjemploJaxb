package org.prueba.generarCorrec;

import java.math.BigDecimal;

import java.util.Date;


public class Productos  {

	/**
	 * 
	 */
	
	
	private int idproducto;
	

	private String seccion;
	

	private Categorias categoria;
	

	private String subcategoria;
	

	private String titulo;	
	

	private Double precio;
	

	private Date fechaPublicacion;
	

	private String estado;
	

	private Integer visitas;
	

	private BigDecimal nomImagen;

	

	public Productos() {
	}

	public int getIdproducto() {
		return idproducto;
	}

	public void setIdproducto(int idproducto) {
		this.idproducto = idproducto;
	}

	public String getSeccion() {
		return seccion;
	}

	public void setSeccion(String seccion) {
		this.seccion = seccion;
	}



	public Categorias getCategoria() {
		return categoria;
	}

	public void setCategoria(Categorias categoria) {
		this.categoria = categoria;
	}

	public String getSubcategoria() {
		return subcategoria;
	}

	public void setSubcategoria(String subcategoria) {
		this.subcategoria = subcategoria;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public Date getFechaPublicacion() {
		return fechaPublicacion;
	}

	public void setFechaPublicacion(Date fechaPublicacion) {
		this.fechaPublicacion = fechaPublicacion;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Integer getVisitas() {
		return visitas;
	}

	public void setVisitas(Integer visitas) {
		this.visitas = visitas;
	}

	public BigDecimal getNomImagen() {
		return nomImagen;
	}

	public void setNomImagen(BigDecimal nomImagen) {
		this.nomImagen = nomImagen;
	}

	
	

	
	

}
