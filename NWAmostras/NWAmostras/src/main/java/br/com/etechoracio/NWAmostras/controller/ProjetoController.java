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

import br.com.etechoracio.NWAmostras.dao.ProjetoDAO;
import br.com.etechoracio.NWAmostras.model.Laboratorio;
import br.com.etechoracio.NWAmostras.model.Projeto;

@RestController
@RequestMapping("projetos")
public class ProjetoController {

	 @Autowired
	    private ProjetoDAO projetoDAO;
	    
	    @PostMapping
	    public ResponseEntity<Projeto> inserir(@RequestBody Projeto body){
	        projetoDAO.save(body);
	        return ResponseEntity.ok(body);
	    }
	    
	    @GetMapping
	    public List<Projeto> listarTodos(){
	        return projetoDAO.findAll();
	    }
	    
	    @GetMapping("/{id}")
	    public ResponseEntity<Projeto> buscarporId(@PathVariable Integer id){
	        
	        Optional<Projeto> resultado = projetoDAO.findById(id);
	        
	        if(resultado.isEmpty()) {
	            ResponseEntity.noContent().build();
	        }
	        return ResponseEntity.ok(resultado.get());
	    }


	    @PutMapping("/{id}")
	    public ResponseEntity<Projeto> atualizar(@PathVariable Integer id, Projeto body){
	        
	        Optional<Projeto> resultado = projetoDAO.findById(id);
	        
	        if (resultado.isEmpty()) {
	            return ResponseEntity.noContent().build();
	        }
	        
	        return ResponseEntity.ok(projetoDAO.save(body)) ;
	    }
	 

	    
	    @DeleteMapping("/{id}")
	    public ResponseEntity<Laboratorio> deletar(@PathVariable Integer id) {
	        Optional<Projeto> resultado = projetoDAO.findById(id);    
	        if(resultado.isEmpty())
	        {
	            return ResponseEntity.noContent().build();
	        }
	        
	        Projeto inativa = resultado.get();
	        inativa.setInativacao_projeto(LocalDateTime.now());
	        projetoDAO.save(inativa);
	        return ResponseEntity.ok().build();    
	    }
}
