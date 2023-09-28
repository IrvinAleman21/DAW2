package org.cibertec.edu.pe.controller;

import java.util.List;
import java.util.Optional;

import org.cibertec.edu.pe.interfaceServices.IProductoServices;
import org.cibertec.edu.pe.modelo.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class ProductoController {
	
	@Autowired
	private IProductoServices servicio;
	
	//metodo listar
	@GetMapping("/listar")
	public String Listado(Model m) {
		List<Producto> lista = servicio.Listar();
		m.addAttribute("producto", lista);
		return "listar";
	}
	
	//metodo buscar
	@GetMapping("/ver/{id}")
	public String Buscar(@PathVariable String id, Model m) {
		Optional<Producto> ObjC = servicio.Buscar(id);
		m.addAttribute("producto", ObjC);
		return "ver";
	}
	
	
}	
