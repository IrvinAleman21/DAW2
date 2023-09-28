package org.cibertec.edu.pe.modelo;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name="Producto")
public class Producto {
	
	@Id
	private String Id;
	private String Nombres;
	private String Descripcion;
	private double Precio;
	private int Stock;
	
	//metodo constructores
	
	public Producto() {
	}
	
	public Producto(String id, String nombres, String descripcion, double precio, int stock) {
		Id = id;
		Nombres = nombres;
		Descripcion = descripcion;
		Precio = precio;
		Stock = stock;
	}

	//metodos de entrada y salida 
	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getNombres() {
		return Nombres;
	}

	public void setNombres(String nombres) {
		Nombres = nombres;
	}

	public String getDescripcion() {
		return Descripcion;
	}

	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}

	public double getPrecio() {
		return Precio;
	}

	public void setPrecio(double precio) {
		Precio = precio;
	}

	public int getStock() {
		return Stock;
	}

	public void setStock(int stock) {
		Stock = stock;
	}
	
}
