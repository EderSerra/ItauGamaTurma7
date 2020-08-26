package br.paduan.springsample02.dao;

import org.springframework.data.repository.CrudRepository;

import br.paduan.springsample02.model.Departamento;

public interface DepartamentoDAO extends CrudRepository<Departamento, Integer> {
    
}