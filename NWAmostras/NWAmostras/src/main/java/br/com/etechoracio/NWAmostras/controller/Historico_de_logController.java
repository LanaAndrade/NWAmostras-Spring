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

import br.com.etechoracio.NWAmostras.dao.Historico_de_logDAO;
import br.com.etechoracio.NWAmostras.model.Historico_de_log;

@RestController
@RequestMapping("historicos")

public class Historico_de_logController {

	@Autowired
    private Historico_de_logDAO historico_de_logDAO;
    
    @PostMapping
    public ResponseEntity<Historico_de_log> inserir(@RequestBody Historico_de_log body){
        historico_de_logDAO.save(body);
        return ResponseEntity.ok(body);
    }
    
    @GetMapping
    public List<Historico_de_log> listarTodos(){
        return historico_de_logDAO.findAll();
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<Historico_de_log> buscarporId(@PathVariable Integer id){
        
        Optional<Historico_de_log> resultado = historico_de_logDAO.findById(id);
        
        if(resultado.isEmpty()) {
            ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(resultado.get());
    }


    @PutMapping("/{id}")
    public ResponseEntity<Historico_de_log> atualizar(@PathVariable Integer id, Historico_de_log body){
        
        Optional<Historico_de_log> resultado = historico_de_logDAO.findById(id);
        
        if (resultado.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        
        return ResponseEntity.ok(historico_de_logDAO.save(body)) ;
    }
 

    
    @DeleteMapping("/{id}")
    public ResponseEntity<Historico_de_log> deletar(@PathVariable Integer id) {
        Optional<Historico_de_log> resultado = historico_de_logDAO.findById(id);    
        if(resultado.isEmpty())
        {
            return ResponseEntity.noContent().build();
        }
        
        Historico_de_log inativa = resultado.get();
        inativa.setData_inativacao_hist_log(LocalDateTime.now());
        historico_de_logDAO.save(inativa);
        return ResponseEntity.ok().build();    
    }

}
