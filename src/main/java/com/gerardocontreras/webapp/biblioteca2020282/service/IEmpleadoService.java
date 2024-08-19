package com.gerardocontreras.webapp.biblioteca2020282.service;

import java.util.List;

import com.gerardocontreras.webapp.biblioteca2020282.model.Empleado;

public interface IEmpleadoService {

    public List<Empleado> listarEmpleados();

    public Empleado buscarEmpleadoPorId(Long id);

    public Empleado guardarEmpleado(Empleado empleado);

    public void eliminarEmpleado(Empleado empleado);

    public Boolean verificarDpiDuplicado(Empleado empleado);
}
