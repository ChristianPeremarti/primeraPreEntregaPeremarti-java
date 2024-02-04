package com.example.primerapreentrega.controllers;

import com.example.primerapreentrega.models.Cliente;
import com.example.primerapreentrega.models.Detalles;
import com.example.primerapreentrega.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {

    @Autowired
    private Repository repo;

    @GetMapping
    public String index(){ return "connect";}

    @GetMapping ("clientes")
    public List<Cliente> getClientes(){
        return repo.findAll();
    }


    @PostMapping("alta")
    public String post(@RequestBody Cliente cliente){
        repo.save(cliente);
        return "guardado";
    }

    
    @PutMapping("modificar/{id}")
    public String update(@PathVariable Long id, @RequestBody Cliente cliente) {
        Cliente updateCliente = repo.findById(id).get();
        updateCliente.setName(cliente.getName());
        updateCliente.setLastname(cliente.getLastname());
        updateCliente.setDocnumber(cliente.getDocnumber());
        repo.save(updateCliente);
        return "modificado";
    }

    @DeleteMapping("baja/{id}")
        public String delete(@PathVariable Long id){
            Cliente deleteCliente = repo.findById(id).get();
            repo.delete(deleteCliente);
            return "eliminado";
        }

}
