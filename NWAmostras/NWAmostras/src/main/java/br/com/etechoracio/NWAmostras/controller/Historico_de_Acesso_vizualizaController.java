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

import br.com.etechoracio.NWAmostras.dao.Historico_de_Acesso_vizualizaDAO;
import br.com.etechoracio.NWAmostras.model.Historico_de_Acesso_vizualiza;

@RestController
@RequestMapping("historico_de_acesso")
public class Historico_de_Acesso_vizualizaController {

	@Autowired
    private Historico_de_Acesso_vizualizaDAO historico_de_Acesso_vizualizaDAO;
    
    @PostMapping
    public ResponseEntity<Historico_de_Acesso_vizualiza> inserir(@RequestBody Historico_de_Acesso_vizualiza body){
    	historico_de_Acesso_vizualizaDAO.save(body);
        return ResponseEntity.ok(body);
    }
    
    @GetMapping
    public List<Historico_de_Acesso_vizualiza> listarTodos(){
        return historico_de_Acesso_vizualizaDAO.findAll();
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<Historico_de_Acesso_vizualiza> buscarporId(@PathVariable Integer id){
        
        Optional<Historico_de_Acesso_vizualiza> resultado = historico_de_Acesso_vizualizaDAO.findById(id);
        
        if(resultado.isEmpty()) {
            ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(resultado.get());
    }


    @PutMapping("/{id}")
    public ResponseEntity<Historico_de_Acesso_vizualiza> atualizar(@PathVariable Integer id, Historico_de_Acesso_vizualiza body){
        
        Optional<Historico_de_Acesso_vizualiza> resultado = historico_de_Acesso_vizualizaDAO.findById(id);
        
        if (resultado.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        
        return ResponseEntity.ok(historico_de_Acesso_vizualizaDAO.save(body)) ;
    }
 

    
    @DeleteMapping("/{id}")
    public ResponseEntity<Historico_de_Acesso_vizualiza> deletar(@PathVariable Integer id) {
        Optional<Historico_de_Acesso_vizualiza> resultado = historico_de_Acesso_vizualizaDAO.findById(id);    
        if(resultado.isEmpty())
        {
            return ResponseEntity.noContent().build();
        }
        
        Historico_de_Acesso_vizualiza inativa = resultado.get();
        inativa.setData_inativacao_hist_acesso_vizualiza(LocalDateTime.now());
        historico_de_Acesso_vizualizaDAO.save(inativa);
        return ResponseEntity.ok().build();    
    }

}
