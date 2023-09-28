package org.cibertec.edu.pe.services;

import java.util.List;
import java.util.Optional;

import org.cibertec.edu.pe.interfaceServices.IProductoServices;
import org.cibertec.edu.pe.interfaces.IProducto;
import org.cibertec.edu.pe.modelo.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductoService implements IProductoServices {

	@Autowired
	private IProducto data;
	
	@Override
	public List<Producto> Listar() {
		return (List<Producto>)data.findAll();
	}

	@Override
	public int Grabar(Producto ObjC) {
		int rpa = 0;
		Producto Obj = data.save(ObjC);
		if(!Obj.equals(null))rpa = 1;
		return 0;
	}

	@Override
	public Optional<Producto> Buscar(String Id) {
		return data.findById(Id);
	}

}
