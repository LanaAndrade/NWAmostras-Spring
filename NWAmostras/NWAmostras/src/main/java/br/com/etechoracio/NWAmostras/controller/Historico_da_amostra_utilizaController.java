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

import br.com.etechoracio.NWAmostras.dao.Historico_da_amostra_utilizaDAO;
import br.com.etechoracio.NWAmostras.model.Historico_da_amostra_utiliza;

@RestController
@RequestMapping("historico_de_amostra_utiliza")
public class Historico_da_amostra_utilizaController {

	@Autowired
    private Historico_da_amostra_utilizaDAO historico_da_amostra_utilizaDAO;
    
    @PostMapping
    public ResponseEntity<Historico_da_amostra_utiliza> inserir(@RequestBody Historico_da_amostra_utiliza body){
    	historico_da_amostra_utilizaDAO.save(body);
        return ResponseEntity.ok(body);
    }
    
    @GetMapping
    public List<Historico_da_amostra_utiliza> listarTodos(){
        return historico_da_amostra_utilizaDAO.findAll();
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<Historico_da_amostra_utiliza> buscarporId(@PathVariable Integer id){
        
        Optional<Historico_da_amostra_utiliza> resultado = historico_da_amostra_utilizaDAO.findById(id);
        
        if(resultado.isEmpty()) {
            ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(resultado.get());
    }


    @PutMapping("/{id}")
    public ResponseEntity<Historico_da_amostra_utiliza> atualizar(@PathVariable Integer id, Historico_da_amostra_utiliza body){
        
        Optional<Historico_da_amostra_utiliza> resultado = historico_da_amostra_utilizaDAO.findById(id);
        
        if (resultado.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        
        return ResponseEntity.ok(historico_da_amostra_utilizaDAO.save(body)) ;
    }
 

    
    @DeleteMapping("/{id}")
    public ResponseEntity<Historico_da_amostra_utiliza> deletar(@PathVariable Integer id) {
        Optional<Historico_da_amostra_utiliza> resultado = historico_da_amostra_utilizaDAO.findById(id);    
        if(resultado.isEmpty())
        {
            return ResponseEntity.noContent().build();
        }
        
        Historico_da_amostra_utiliza inativa = resultado.get();
        inativa.setData_inativacao_hist_amostra(LocalDateTime.now());
        historico_da_amostra_utilizaDAO.save(inativa);
        return ResponseEntity.ok().build();    
    }
}
