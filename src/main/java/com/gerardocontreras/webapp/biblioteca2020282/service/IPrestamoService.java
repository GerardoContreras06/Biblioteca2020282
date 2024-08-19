package com.gerardocontreras.webapp.biblioteca2020282.service;

import java.util.List;

import com.gerardocontreras.webapp.biblioteca2020282.model.Prestamo;

public interface IPrestamoService {

    public List<Prestamo> listaPrestamos();

    public Prestamo buscarPrestamoPorId(Long id);

    public Prestamo guardarPrestamo(Prestamo prestamo);

    public void eliminarPrestamo(Prestamo prestamo);

}