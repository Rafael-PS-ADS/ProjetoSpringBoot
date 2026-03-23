package com.curso.boot.dao;

import java.util.List;

import com.curso.boot.domain.Departamento;

public class DepartamentoDao {

    void save(Departamento departamento);

    void update(Departamento departamento);

    void delete(Long id);

    Departamento findById(Long id);

    List<Departamento> findAll();
    
}
