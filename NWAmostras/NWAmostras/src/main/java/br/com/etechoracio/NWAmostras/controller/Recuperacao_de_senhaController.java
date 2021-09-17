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

import br.com.etechoracio.NWAmostras.dao.Recuperacao_de_senhaDAO;
import br.com.etechoracio.NWAmostras.model.Recuperacao_de_senha;

@RestController
@RequestMapping("recuperacao_de_senha")
public class Recuperacao_de_senhaController {

	@Autowired
    private Recuperacao_de_senhaDAO recuperacao_de_senhaDAO;
    
    @PostMapping
    public ResponseEntity<Recuperacao_de_senha> inserir(@RequestBody Recuperacao_de_senha body){
    	recuperacao_de_senhaDAO.save(body);
        return ResponseEntity.ok(body);
    }
    
    @GetMapping
    public List<Recuperacao_de_senha> listarTodos(){
        return recuperacao_de_senhaDAO.findAll();
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<Recuperacao_de_senha> buscarporId(@PathVariable Integer id){
        
        Optional<Recuperacao_de_senha> resultado = recuperacao_de_senhaDAO.findById(id);
        
        if(resultado.isEmpty()) {
            ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(resultado.get());
    }


    @PutMapping("/{id}")
    public ResponseEntity<Recuperacao_de_senha> atualizar(@PathVariable Integer id, Recuperacao_de_senha body){
        
        Optional<Recuperacao_de_senha> resultado = recuperacao_de_senhaDAO.findById(id);
        
        if (resultado.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        
        return ResponseEntity.ok(recuperacao_de_senhaDAO.save(body)) ;
    }
 

    
    @DeleteMapping("/{id}")
    public ResponseEntity<Recuperacao_de_senha> deletar(@PathVariable Integer id) {
        Optional<Recuperacao_de_senha> resultado = recuperacao_de_senhaDAO.findById(id);    
        if(resultado.isEmpty())
        {
            return ResponseEntity.noContent().build();
        }
        
        Recuperacao_de_senha inativa = resultado.get();
        inativa.setData_inativacao_rec_senha(LocalDateTime.now());
        recuperacao_de_senhaDAO.save(inativa);
        return ResponseEntity.ok().build();    
    }
}
