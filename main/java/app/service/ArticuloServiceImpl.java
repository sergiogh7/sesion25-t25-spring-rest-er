package app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import app.dao.IArticuloDAO;
import app.dto.Articulo;

@Service // Indica que e sun servicio.
public class ArticuloServiceImpl implements IArticuloService{
	
	@Autowired // Como una herencia, se trae lo del DAO.
	IArticuloDAO iArticuloDAO;
	
	@Override // Para que sobreescriba.
	public List<Articulo> listarArticulo(){
		return iArticuloDAO.findAll();
	}
	
	@Override
	public Articulo guardarArticulo(Articulo articulo) {
		return iArticuloDAO.save(articulo);
	}
	
	@Override
	public Articulo articuloXID(Integer id) {
		return iArticuloDAO.findById(id).get();
	}
	
	@Override
	public Articulo actualizarArticulo(Articulo articulo) {
		return iArticuloDAO.save(articulo);
	}
	
	@Override
	public void eliminarArticulo(Integer id) {
		iArticuloDAO.deleteById(id);
	}

}