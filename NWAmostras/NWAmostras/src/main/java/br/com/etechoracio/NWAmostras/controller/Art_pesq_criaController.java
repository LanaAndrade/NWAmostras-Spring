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

import br.com.etechoracio.NWAmostras.dao.Art_pesq_criaDAO;
import br.com.etechoracio.NWAmostras.model.Art_pesq_cria;

@RestController
@RequestMapping("art_pesq_cria")
public class Art_pesq_criaController {

	@Autowired
    private Art_pesq_criaDAO art_pesq_criaDAO;
    
    @PostMapping
    public ResponseEntity<Art_pesq_cria> inserir(@RequestBody Art_pesq_cria body){
    	art_pesq_criaDAO.save(body);
        return ResponseEntity.ok(body);
    }
    
    @GetMapping
    public List<Art_pesq_cria> listarTodos(){
        return art_pesq_criaDAO.findAll();
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<Art_pesq_cria> buscarporId(@PathVariable Integer id){
        
        Optional<Art_pesq_cria> resultado = art_pesq_criaDAO.findById(id);
        
        if(resultado.isEmpty()) {
            ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(resultado.get());
    }


    @PutMapping("/{id}")
    public ResponseEntity<Art_pesq_cria> atualizar(@PathVariable Integer id, Art_pesq_cria body){
        
        Optional<Art_pesq_cria> resultado = art_pesq_criaDAO.findById(id);
        
        if (resultado.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        
        return ResponseEntity.ok(art_pesq_criaDAO.save(body)) ;
    }
 

    
    @DeleteMapping("/{id}")
    public ResponseEntity<Art_pesq_cria> deletar(@PathVariable Integer id) {
        Optional<Art_pesq_cria> resultado = art_pesq_criaDAO.findById(id);    
        if(resultado.isEmpty())
        {
            return ResponseEntity.noContent().build();
        }
        
        Art_pesq_cria inativa = resultado.get();
        inativa.setData_inativacao_art_pesq_cria(LocalDateTime.now());
        art_pesq_criaDAO.save(inativa);
        return ResponseEntity.ok().build();    
    }

}
