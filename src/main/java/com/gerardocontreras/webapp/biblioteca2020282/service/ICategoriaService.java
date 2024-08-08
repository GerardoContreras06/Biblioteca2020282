package com.gerardocontreras.webapp.biblioteca2020282.service;

import java.util.List;

import com.gerardocontreras.webapp.biblioteca2020282.model.Categoria;

public interface ICategoriaService {

    public List<Categoria> listarCategorias();

    public Categoria guardarCategoria(Categoria categoria);

    public Categoria buscarCategoriaPorId(Long id);

    public void eliminarCategoria(Categoria categoria);

}
