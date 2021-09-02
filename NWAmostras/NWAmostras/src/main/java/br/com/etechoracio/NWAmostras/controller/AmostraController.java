package br.com.etechoracio.NWAmostras.controller;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.etechoracio.NWAmostras.dao.AmostraDAO;
import br.com.etechoracio.NWAmostras.model.Amostra;
import br.com.etechoracio.NWAmostras.model.Laboratorio;

@RestController
@RequestMapping("amostras")
public class AmostraController {
	
    @Autowired
    private AmostraDAO amostraDAO;
    
    @PostMapping
    public ResponseEntity<Amostra> inserir(@RequestBody Amostra body){
        amostraDAO.save(body);
        return ResponseEntity.ok(body);
    }
    
    @GetMapping
    public List<Amostra> listarTodos(){
        return amostraDAO.findAll();
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<Amostra> buscarporId(@PathVariable Integer id){
        
        Optional<Amostra> resultado = amostraDAO.findById(id);
        
        if(resultado.isEmpty()) {
            ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(resultado.get());
    }


    @PutMapping("/{id}")
    public ResponseEntity<Amostra> atualizar(@PathVariable Integer id, Amostra body){
        
        Optional<Amostra> resultado = amostraDAO.findById(id);
        
        if (resultado.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        
        return ResponseEntity.ok(amostraDAO.save(body)) ;
    }
 

    
    @DeleteMapping("/{id}")
    public ResponseEntity<Laboratorio> deletar(@PathVariable Integer id) {
        Optional<Amostra> resultado = amostraDAO.findById(id);    
        if(resultado.isEmpty())
        {
            return ResponseEntity.noContent().build();
        }
        
        Amostra inativa = resultado.get();
        inativa.setData_inativacao_amostra(LocalDateTime.now());
        amostraDAO.save(inativa);
        return ResponseEntity.ok().build();    
    }

}
