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

import br.com.etechoracio.NWAmostras.dao.PesquisadorDAO;
import br.com.etechoracio.NWAmostras.model.Pesquisador;

public class PesquisadorController {

	@RestController
	@RequestMapping("pesquisadores")
	public class AmostraController {
		
	    @Autowired
	    private PesquisadorDAO pesquisadorDAO;
	    
	    @PostMapping
	    public ResponseEntity<Pesquisador> inserir(@RequestBody Pesquisador body){
	        pesquisadorDAO.save(body);
	        return ResponseEntity.ok(body);
	    }
	    
	    @GetMapping
	    public List<Pesquisador> listarTodos(){
	        return pesquisadorDAO.findAll();
	    }
	    
	    @GetMapping("/{id}")
	    public ResponseEntity<Pesquisador> buscarporId(@PathVariable Integer id){
	        
	        Optional<Pesquisador> resultado = pesquisadorDAO.findById(id);
	        
	        if(resultado.isEmpty()) {
	            ResponseEntity.noContent().build();
	        }
	        return ResponseEntity.ok(resultado.get());
	    }


	    @PutMapping("/{id}")
	    public ResponseEntity<Pesquisador> atualizar(@PathVariable Integer id, Pesquisador body){
	        
	        Optional<Pesquisador> resultado = pesquisadorDAO.findById(id);
	        
	        if (resultado.isEmpty()) {
	            return ResponseEntity.noContent().build();
	        }
	        
	        return ResponseEntity.ok(pesquisadorDAO.save(body)) ;
	    }
	 

	    
	    @DeleteMapping("/{id}")
	    public ResponseEntity<Pesquisador> deletar(@PathVariable Integer id) {
	        Optional<Pesquisador> resultado = pesquisadorDAO.findById(id);    
	        if(resultado.isEmpty())
	        {
	            return ResponseEntity.noContent().build();
	        }
	        
	        Pesquisador inativa = resultado.get();
	        inativa.setData_inativacao_pesq(LocalDateTime.now());
	        pesquisadorDAO.save(inativa);
	        return ResponseEntity.ok().build();    
	    }

}
}
