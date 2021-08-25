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
import app.dto.Fabricante;
import app.service.FabricanteServiceImpl;

@RestController
public class FabricanteController {

	@Autowired
	FabricanteServiceImpl fabricanteServiceImpl;
	
	@CrossOrigin(origins="*")
	@GetMapping("/fabricante")
	public List<Fabricante> listarFabricante(){
		return fabricanteServiceImpl.listarFabricantes();
	}
	
	@PostMapping("/fabricante")
	public Fabricante guardarFabricante(@RequestBody Fabricante fabricante) {
		return fabricanteServiceImpl.guardarFabricante(fabricante);
	}
	
	@GetMapping("/fabricante/{id}")
	public Fabricante fabricanteXID(@PathVariable(name="id")Integer id) {
		Fabricante fabricante_xid = new Fabricante();
		
		fabricante_xid = fabricanteServiceImpl.fabricanteXID(id);
		
		return fabricante_xid;
	}
	
	@PutMapping("/fabricante/{id}")
	public Fabricante actualizarFabricante(@PathVariable(name="id") Integer id, @RequestBody Fabricante fabricante) {
		
		Fabricante fabricanteSeleccionado = new Fabricante();
		Fabricante fabricanteActualizado = new Fabricante();
		
		fabricanteSeleccionado = fabricanteServiceImpl.fabricanteXID(id);
		
		fabricanteSeleccionado.setNombre(fabricante.getNombre());
		
		return fabricanteActualizado;
	}
	
	@DeleteMapping("/fabricante/{id}")
	public void eliminarFabricante(@PathVariable(name="id") Integer id) {
		fabricanteServiceImpl.eliminarFabricante(id);
	}
	
}
