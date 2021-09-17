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

import br.com.etechoracio.NWAmostras.dao.Amostra_no_Mapa_contemDAO;
import br.com.etechoracio.NWAmostras.model.Amostra_no_Mapa_contem;
import br.com.etechoracio.NWAmostras.model.Laboratorio;

@RestController
@RequestMapping("amostra_no_mapa_contem")
public class Amostra_no_Mapa_contemController {

	@Autowired
    private Amostra_no_Mapa_contemDAO amostra_no_mapa_contemDAO;
    
    @PostMapping
    public ResponseEntity<Amostra_no_Mapa_contem> inserir(@RequestBody Amostra_no_Mapa_contem body){
        amostra_no_mapa_contemDAO.save(body);
        return ResponseEntity.ok(body);
    }
    
    @GetMapping
    public List<Amostra_no_Mapa_contem> listarTodos(){
        return amostra_no_mapa_contemDAO.findAll();
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<Amostra_no_Mapa_contem> buscarporId(@PathVariable Integer id){
        
        Optional<Amostra_no_Mapa_contem> resultado = amostra_no_mapa_contemDAO.findById(id);
        
        if(resultado.isEmpty()) {
            ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(resultado.get());
    }


    @PutMapping("/{id}")
    public ResponseEntity<Amostra_no_Mapa_contem> atualizar(@PathVariable Integer id, Amostra_no_Mapa_contem body){
        
        Optional<Amostra_no_Mapa_contem> resultado = amostra_no_mapa_contemDAO.findById(id);
        
        if (resultado.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        
        return ResponseEntity.ok(amostra_no_mapa_contemDAO.save(body)) ;
    }
 

    
    @DeleteMapping("/{id}")
    public ResponseEntity<Amostra_no_Mapa_contem> deletar(@PathVariable Integer id) {
        Optional<Amostra_no_Mapa_contem> resultado = amostra_no_mapa_contemDAO.findById(id);    
        if(resultado.isEmpty())
        {
            return ResponseEntity.noContent().build();
        }
        
        Amostra_no_Mapa_contem inativa = resultado.get();
        inativa.setData_inativacao_amostra_no_mapa_contem(LocalDateTime.now());
        amostra_no_mapa_contemDAO.save(inativa);
        return ResponseEntity.ok().build();    
    }

	
}
