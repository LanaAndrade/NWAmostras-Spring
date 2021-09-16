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

import br.com.etechoracio.NWAmostras.dao.InformacaoDAO;
import br.com.etechoracio.NWAmostras.model.Informacao;
import br.com.etechoracio.NWAmostras.model.Laboratorio;

@RestController
@RequestMapping("informacoes")
public class InformacaoController {

	 @Autowired
	    private InformacaoDAO informacaoDAO;
	    
	    @PostMapping
	    public ResponseEntity<Informacao> inserir(@RequestBody Informacao body){
	        informacaoDAO.save(body);
	        return ResponseEntity.ok(body);
	    }
	    
	    @GetMapping
	    public List<Informacao> listarTodos(){
	        return informacaoDAO.findAll();
	    }
	    
	    @GetMapping("/{id}")
	    public ResponseEntity<Informacao> buscarporId(@PathVariable Integer id){
	        
	        Optional<Informacao> resultado = informacaoDAO.findById(id);
	        
	        if(resultado.isEmpty()) {
	            ResponseEntity.noContent().build();
	        }
	        return ResponseEntity.ok(resultado.get());
	    }


	    @PutMapping("/{id}")
	    public ResponseEntity<Informacao> atualizar(@PathVariable Integer id, Informacao body){
	        
	        Optional<Informacao> resultado = informacaoDAO.findById(id);
	        
	        if (resultado.isEmpty()) {
	            return ResponseEntity.noContent().build();
	        }
	        
	        return ResponseEntity.ok(informacaoDAO.save(body)) ;
	    }
	 

	    
	    @DeleteMapping("/{id}")
	    public ResponseEntity<Laboratorio> deletar(@PathVariable Integer id) {
	        Optional<Informacao> resultado = informacaoDAO.findById(id);    
	        if(resultado.isEmpty())
	        {
	            return ResponseEntity.noContent().build();
	        }
	        
	        Informacao inativa = resultado.get();
	        inativa.setData_inativacao_informacao(LocalDateTime.now());
	        informacaoDAO.save(inativa);
	        return ResponseEntity.ok().build();    
	    }
}
