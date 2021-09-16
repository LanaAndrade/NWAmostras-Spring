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
import br.com.etechoracio.NWAmostras.dao.CampoDAO;
import br.com.etechoracio.NWAmostras.model.Amostra;
import br.com.etechoracio.NWAmostras.model.Campo;
import br.com.etechoracio.NWAmostras.model.Laboratorio;

@RestController
@RequestMapping("campos")
public class CampoController {

	@Autowired
    private CampoDAO campoDAO;
    
    @PostMapping
    public ResponseEntity<Campo> inserir(@RequestBody Campo body){
        campoDAO.save(body);
        return ResponseEntity.ok(body);
    }
    
    @GetMapping
    public List<Campo> listarTodos(){
        return campoDAO.findAll();
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<Campo> buscarporId(@PathVariable Integer id){
        
        Optional<Campo> resultado = campoDAO.findById(id);
        
        if(resultado.isEmpty()) {
            ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(resultado.get());
    }


    @PutMapping("/{id}")
    public ResponseEntity<Campo> atualizar(@PathVariable Integer id, Campo body){
        
        Optional<Campo> resultado = campoDAO.findById(id);
        
        if (resultado.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        
        return ResponseEntity.ok(campoDAO.save(body)) ;
    }
 

    
    @DeleteMapping("/{id}")
    public ResponseEntity<Laboratorio> deletar(@PathVariable Integer id) {
        Optional<Campo> resultado = campoDAO.findById(id);    
        if(resultado.isEmpty())
        {
            return ResponseEntity.noContent().build();
        }
        
        Campo inativa = resultado.get();
        inativa.setData_inativacao_campo(LocalDateTime.now());
        campoDAO.save(inativa);
        return ResponseEntity.ok().build();    
    }

}
