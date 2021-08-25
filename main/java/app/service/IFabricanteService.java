package app.service;

import java.util.List;

import app.dto.Fabricante;

public interface IFabricanteService {
	
//	Lista los fabricantes
	public List<Fabricante> listarFabricantes();
	
//	CREATE
	public Fabricante guardarFabricante(Fabricante fabricante);
	
//	READ
	public Fabricante fabricanteXID(Integer id);
	
//	UPDATE
	public Fabricante actualizarFabricante(Fabricante fabricante);

//	DELETE
	public void eliminarFabricante(Integer id);
}
