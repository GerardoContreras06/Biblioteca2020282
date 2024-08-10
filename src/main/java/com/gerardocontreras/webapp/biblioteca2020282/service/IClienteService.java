package com.gerardocontreras.webapp.biblioteca2020282.service;

import java.util.List;

import com.gerardocontreras.webapp.biblioteca2020282.model.Cliente;

public interface IClienteService {

    public List<Cliente> listarClientes();

    public Cliente buscarClientePorDPI(Long dpi);

    public Cliente guardarCliente(Cliente cliente);

    public void eliminarCliente(Cliente cliente);
}
