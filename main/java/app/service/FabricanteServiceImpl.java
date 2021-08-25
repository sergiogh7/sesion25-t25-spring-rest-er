package app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import app.dao.IFabricanteDAO;
import app.dto.Fabricante;

@Service // Indica que e sun servicio.
public class FabricanteServiceImpl implements IFabricanteService{
	
	@Autowired // Como una herencia, se trae lo del DAO.
	IFabricanteDAO iFabricanteDAO;
	
	@Override // Para que sobreescriba.
	public List<Fabricante> listarFabricantes(){
		return iFabricanteDAO.findAll();
	}
	
	@Override
	public Fabricante guardarFabricante(Fabricante fabricante) {
		return iFabricanteDAO.save(fabricante);
	}
	
	@Override
	public Fabricante fabricanteXID(Integer id) {
		return iFabricanteDAO.findById(id).get();
	}
	
	@Override
	public Fabricante actualizarFabricante(Fabricante fabricante) {
		return iFabricanteDAO.save(fabricante);
	}
	
	@Override
	public void eliminarFabricante(Integer id) {
		iFabricanteDAO.deleteById(id);
	}

}
