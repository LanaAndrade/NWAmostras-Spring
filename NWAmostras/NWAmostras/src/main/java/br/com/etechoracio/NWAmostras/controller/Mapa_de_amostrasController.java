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
import br.com.etechoracio.NWAmostras.dao.Mapa_de_amostrasDAO;
import br.com.etechoracio.NWAmostras.model.Amostra;
import br.com.etechoracio.NWAmostras.model.Laboratorio;
import br.com.etechoracio.NWAmostras.model.Mapa_de_amostras;

@RestController
@RequestMapping("mapa_de_amostras")

public class Mapa_de_amostrasController {

	@Autowired
    private Mapa_de_amostrasDAO mapa_de_amostrasDAO;
    
    @PostMapping
    public ResponseEntity<Mapa_de_amostras> inserir(@RequestBody Mapa_de_amostras body){
        mapa_de_amostrasDAO.save(body);
        return ResponseEntity.ok(body);
    }
    
    @GetMapping
    public List<Mapa_de_amostras> listarTodos(){
        return mapa_de_amostrasDAO.findAll();
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<Mapa_de_amostras> buscarporId(@PathVariable Integer id){
        
        Optional<Mapa_de_amostras> resultado = mapa_de_amostrasDAO.findById(id);
        
        if(resultado.isEmpty()) {
            ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(resultado.get());
    }


    @PutMapping("/{id}")
    public ResponseEntity<Mapa_de_amostras> atualizar(@PathVariable Integer id, Mapa_de_amostras body){
        
        Optional<Mapa_de_amostras> resultado = mapa_de_amostrasDAO.findById(id);
        
        if (resultado.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        
        return ResponseEntity.ok(mapa_de_amostrasDAO.save(body)) ;
    }
 

    
    @DeleteMapping("/{id}")
    public ResponseEntity<Laboratorio> deletar(@PathVariable Integer id) {
        Optional<Mapa_de_amostras> resultado = mapa_de_amostrasDAO.findById(id);    
        if(resultado.isEmpty())
        {
            return ResponseEntity.noContent().build();
        }
        
        Mapa_de_amostras inativa = resultado.get();
        inativa.setData_inativacao_mapa_amostra(LocalDateTime.now());
        mapa_de_amostrasDAO.save(inativa);
        return ResponseEntity.ok().build();    
    }
}
