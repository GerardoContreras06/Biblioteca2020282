package com.gerardocontreras.webapp.biblioteca2020282.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gerardocontreras.webapp.biblioteca2020282.model.Libro;

public interface LibroRepository extends JpaRepository<Libro, Long>{

}