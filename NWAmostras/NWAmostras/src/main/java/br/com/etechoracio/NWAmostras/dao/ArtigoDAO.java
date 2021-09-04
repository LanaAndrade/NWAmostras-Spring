package br.com.etechoracio.NWAmostras.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.etechoracio.NWAmostras.model.Artigo;

public interface ArtigoDAO extends JpaRepository<Artigo, Integer>{

}
