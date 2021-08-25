package app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import app.dto.Articulo;

public interface IArticuloDAO extends JpaRepository<Articulo, Integer>{

}
