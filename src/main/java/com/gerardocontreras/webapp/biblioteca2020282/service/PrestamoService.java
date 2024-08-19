package com.gerardocontreras.webapp.biblioteca2020282.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gerardocontreras.webapp.biblioteca2020282.model.Prestamo;
import com.gerardocontreras.webapp.biblioteca2020282.repository.PrestamoRepository;

@Service
public class PrestamoService implements IPrestamoService{

    @Autowired
    PrestamoRepository prestamoRepository;

    @Override
    public List<Prestamo> listaPrestamos() {
       return prestamoRepository.findAll();
    }

    @Override
    public Prestamo buscarPrestamoPorId(Long id) {
        return prestamoRepository.findById(id).orElse(null);
    }

    @Override
    public Prestamo guardarPrestamo(Prestamo prestamo) {
        return prestamoRepository.save(prestamo);
    }

    @Override
    public void eliminarPrestamo(Prestamo prestamo) {
        prestamoRepository.delete(prestamo);
    }

}