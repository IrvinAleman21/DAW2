package org.cibertec.edu.pe.interfaceServices;

import java.util.List;
import java.util.Optional;

import org.cibertec.edu.pe.modelo.Producto;

public interface IProductoServices {
	public List<Producto> Listar();
	public Optional<Producto> Buscar(String Id);
	public int Grabar(Producto ObjC);
}
