package com.gerardocontreras.webapp.biblioteca2020282.service;

import java.util.List;

import com.gerardocontreras.webapp.biblioteca2020282.model.Libro;

public interface ILibroService {

    public List<Libro> listaLibros();

    public Libro buscarLibroPorId(Long id);

    public Libro guardaLibro(Libro libro);

    public void eliminarLibro(Libro libro);
}