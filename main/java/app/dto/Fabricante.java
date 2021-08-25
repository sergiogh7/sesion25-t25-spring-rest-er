package app.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="fabricante")
public class Fabricante {
	
//	Atributos
/////////////
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "nombre")
	private String nombre;
	
//	Constructores
/////////////////
	public Fabricante() {
		
	}
	public Fabricante(int id, String nombre) {
		this.id=id;
		this.nombre=nombre;
	}
	
//	Metodos
///////////
	public String toString() {
		return "Fabricante:"
				+ "\nCodigo: " + id
				+ "\n Nombre: " + nombre;
	}
	
//	Getters y Setters
/////////////////////
	public int getCodigo() {
		return id;
	}
	public void setCodigo(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
