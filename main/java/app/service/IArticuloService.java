package app.service;

import java.util.List;

import app.dto.Articulo;

public interface IArticuloService {

//	Lista los fabricantes
	public List<Articulo> listarArticulo();
	
//	CREATE
	public Articulo guardarArticulo(Articulo articulo);
	
//	READ
	public Articulo articuloXID(Integer id);
	
//	UPDATE
	public Articulo actualizarArticulo(Articulo articulo);

//	DELETE
	public void eliminarArticulo(Integer id);
	
}
