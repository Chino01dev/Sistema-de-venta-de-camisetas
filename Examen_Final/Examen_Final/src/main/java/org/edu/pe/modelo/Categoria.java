package org.edu.pe.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "categorias")
public class Categoria {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idCategoria;
	private String descripcion, imagen;
	private char estado;
	
	public Categoria() {
	}

	public Categoria(int idCategoria, String descripcion, String imagen, char estado) {
		this.idCategoria = idCategoria;
		this.descripcion = descripcion;
		this.imagen = imagen;
		this.estado = estado;
	}

	public int getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(int idCategoria) {
		this.idCategoria = idCategoria;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public char getEstado() {
		return estado;
	}

	public void Categoria(char estado) {
		this.estado = estado;
	}

	
	
	
	
}
