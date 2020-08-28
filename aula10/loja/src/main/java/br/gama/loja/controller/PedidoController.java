package br.gama.loja.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.gama.loja.dao.PedidoDAO;
import br.gama.loja.model.Pedido;

@RestController
@CrossOrigin("*")
public class PedidoController {
    
    @Autowired
    private PedidoDAO dao;

    //buscar um pedido por número do pedido
    @GetMapping("/pedido/{id}")
    public ResponseEntity<Pedido> buscaPorId(@PathVariable int id){
        Pedido pedido = dao.findById(id).orElse(null);

        if(pedido != null){
            return ResponseEntity.ok(pedido);
        }else{
            return ResponseEntity.notFound().build();
        }
    }


    //listar todos os pedidos
    @GetMapping("/pedidos")
    public List<Pedido> listarTodos(){
        List<Pedido> lista = (List<Pedido>) dao.findAll();
        return lista;
    }

    //listar todos os pedidos pendentes
    @GetMapping("/pedidos/status/{status}")
    public List<Pedido> buscaPorStatus(@PathVariable char status){
        List<Pedido> lista = dao.findByStatus(status);
        return lista;
    }


}