package com.gerardocontreras.webapp.biblioteca2020282.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gerardocontreras.webapp.biblioteca2020282.model.Libro;
import com.gerardocontreras.webapp.biblioteca2020282.repository.LibroRepository;

@Service
public class LibroService implements ILibroService {

    @Autowired
    LibroRepository libroRepository;

    @Override
    public List<Libro> listaLibros() {
       return libroRepository.findAll();
    }

    @Override
    public Libro buscarLibroPorId(Long id) {
       return libroRepository.findById(id).orElse(null);
    }

    @Override
    public Libro guardaLibro(Libro libro) {
       return libroRepository.save(libro);
    }

    @Override
    public void eliminarLibro(Libro libro) {
        libroRepository.delete(libro);
    }

}