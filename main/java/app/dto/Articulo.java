package app.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="articulo")
public class Articulo {

//	Atributos
/////////////
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "precio")
	private int precio;
	@Column(name = "codigoFabricante")
	private int fabricante;
	
//	Constructores
/////////////////
	public Articulo() {
		
	}
	public Articulo(int id, String nombre, int precio, int fabricante) {
		this.id=id;
		this.nombre=nombre;
		this.precio=precio;
		this.fabricante=fabricante;
	}
	
//	Metodos
///////////
	public String toString() {
		return "Articulo:"
				+ "\nCodigo: " + id
				+ "\n Nombre: " + nombre
				+ "\n Preico: " + precio
				+ "\n Fabricnate: " + fabricante;
	}
	
//	Getters y Setters
/////////////////////
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public int getFabricante() {
		return fabricante;
	}
	public void setFabricante(int fabricante) {
		this.fabricante = fabricante;
	}
}
