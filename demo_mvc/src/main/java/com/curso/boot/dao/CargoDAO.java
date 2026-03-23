package com.curso.boot.dao;

import java.util.List;

import com.curso.boot.domain.Cargo;

public class CargoDAO {

    void save(Cargo cargo);

    void update(Cargo cargo);

    void delete(Long id);

    Cargo findById(Long id);

    List<Cargo> findAll();

}
