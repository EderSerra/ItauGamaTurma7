package br.paduan.springsample02.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.paduan.springsample02.dao.DepartamentoDAO;
import br.paduan.springsample02.model.Departamento;

@RestController
@CrossOrigin("*")
public class DepartamentoController {
    
    @Autowired
    private DepartamentoDAO dao;

    @GetMapping("/departamentos")
    public List<Departamento> getDepartamentos(){
        List<Departamento> lista = ( List<Departamento> ) dao.findAll();
        return lista;
    }

    @GetMapping("/departamento/{cod}")
    public ResponseEntity<Departamento> findDepartamento(@PathVariable int cod){
        Departamento depto = dao.findById(cod).orElse(null);

        if(depto != null){
            return ResponseEntity.ok(depto);
        }
        return ResponseEntity.status(404).build();
    }
}