package app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import app.dto.Fabricante;

public interface IFabricanteDAO extends JpaRepository<Fabricante, Integer>{
	
}
