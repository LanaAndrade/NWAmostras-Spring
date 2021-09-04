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

import br.com.etechoracio.NWAmostras.dao.ArtigoDAO;
import br.com.etechoracio.NWAmostras.model.Artigo;


@RestController
@RequestMapping("")
public class ArtigoController {
	
    @Autowired
    private ArtigoDAO artigoDAO;
    
    @PostMapping
    public ResponseEntity<Artigo> inserir(@RequestBody Artigo body){
    	artigoDAO.save(body);
        return ResponseEntity.ok(body);
    }
    
    @GetMapping
    public List<Artigo> listarTodos(){
        return artigoDAO.findAll();
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<Artigo> buscarporId(@PathVariable Integer id){
        
        Optional<Artigo> resultado = artigoDAO.findById(id);
        
        if(resultado.isEmpty()) {
            ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(resultado.get());
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<Artigo> atualizar(@PathVariable Integer id, Artigo body){
        
        Optional<Artigo> resultado = artigoDAO.findById(id);
        
        if (resultado.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        
        return ResponseEntity.ok(artigoDAO.save(body)) ;
    }
 
    
    @DeleteMapping("/{id}")
    public ResponseEntity<Artigo> deletar(@PathVariable Integer id) {
        Optional<Artigo> resultado = artigoDAO.findById(id);    
        if(resultado.isEmpty())
        {
            return ResponseEntity.noContent().build();
        }
        
        Artigo inativa = resultado.get();
        inativa.setInativacao_artigo(LocalDateTime.now());
        artigoDAO.save(inativa);
        return ResponseEntity.ok().build();    
    }

}
