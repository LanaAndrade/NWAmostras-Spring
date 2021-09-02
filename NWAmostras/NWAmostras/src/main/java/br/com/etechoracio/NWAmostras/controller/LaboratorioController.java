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

import br.com.etechoracio.NWAmostras.dao.LaboratorioDAO;
import br.com.etechoracio.NWAmostras.model.Amostra;
import br.com.etechoracio.NWAmostras.model.Laboratorio;


@RestController
@RequestMapping("laboratorios")
public class LaboratorioController {

    @Autowired
    private LaboratorioDAO laboratorioDAO;
    
    @PostMapping
    public ResponseEntity<Laboratorio> inserir(@RequestBody Laboratorio body){
    	laboratorioDAO.save(body);
        return ResponseEntity.ok(body);
    }
    
    @GetMapping
    public List<Laboratorio> listarTodos(){
        return laboratorioDAO.findAll();
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<Laboratorio> buscarporId(@PathVariable Integer id){
        
        Optional<Laboratorio> resultado = laboratorioDAO.findById(id);
        
        if(resultado.isEmpty()) {
            ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(resultado.get());
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<Laboratorio> atualizar(@PathVariable Integer id, Laboratorio body){
        
        Optional<Laboratorio> resultado = laboratorioDAO.findById(id);
        
        if (resultado.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        
        return ResponseEntity.ok(laboratorioDAO.save(body)) ;
    }
 
    
    @DeleteMapping("/{id}")
    public ResponseEntity<Laboratorio> deletar(@PathVariable Integer id) {
        Optional<Laboratorio> resultado = laboratorioDAO.findById(id);    
        if(resultado.isEmpty())
        {
            return ResponseEntity.noContent().build();
        }
        
        Laboratorio inativa = resultado.get();
        inativa.setData_inativacao_lab(LocalDateTime.now());
        laboratorioDAO.save(inativa);
        return ResponseEntity.ok().build();    
    }
}
