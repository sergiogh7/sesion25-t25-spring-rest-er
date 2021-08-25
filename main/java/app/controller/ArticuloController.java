package app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import app.dto.Articulo;
import app.service.ArticuloServiceImpl;

@RestController
public class ArticuloController {

	@Autowired
	ArticuloServiceImpl articuloServiceImpl;
	
	@CrossOrigin(origins="*")
	@GetMapping("/articulo")
	public List<Articulo> listarArticulo(){
		return articuloServiceImpl.listarArticulo();
	}
	
	@PostMapping("/articulo")
	public Articulo guardarArticulo(@RequestBody Articulo articulo) {
		return articuloServiceImpl.guardarArticulo(articulo);
	}
	
	@GetMapping("/articulo/{id}")
	public Articulo articuloXID(@PathVariable(name="id")Integer id) {
		Articulo articulo_XID = new Articulo();
		
		articulo_XID = articuloServiceImpl.articuloXID(id);
		
		return articulo_XID;
	}
	
	@PutMapping("/articulo/{id}")
	public Articulo actualizarArticulo(@PathVariable(name="id") Integer id, @RequestBody Articulo articulo) {
		
		Articulo articuloSeleccionado = new Articulo();
		Articulo articuloActualizado = new Articulo();
		
		articuloSeleccionado = articuloServiceImpl.articuloXID(id);
		
		articuloSeleccionado.setNombre(articulo.getNombre());
		
		return articuloActualizado;
	}
	
	@DeleteMapping("/articulo/{id}")
	public void eliminarArticulo(@PathVariable(name="id") Integer id) {
		articuloServiceImpl.eliminarArticulo(id);
	}
	
}