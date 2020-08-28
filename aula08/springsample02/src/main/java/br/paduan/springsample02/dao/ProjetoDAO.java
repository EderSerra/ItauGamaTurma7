package br.paduan.springsample02.dao;

import org.springframework.data.repository.CrudRepository;

import br.paduan.springsample02.model.Projeto;

public interface ProjetoDAO extends CrudRepository<Projeto, Integer>{ 
    
}