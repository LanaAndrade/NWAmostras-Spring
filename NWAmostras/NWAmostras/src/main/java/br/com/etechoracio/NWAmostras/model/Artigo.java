package br.com.etechoracio.NWAmostras.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

import java.sql.Date;
import java.time.LocalDateTime;

/*
id_artigo serial constraint id_artigo_pk primary key,
dt_artigo date,
titulo_artigo varchar(150),
conteudo_artigo blob,
palavras_chave_artigo varchar(250),
resumo_artigo text,
inativacao_artigo datetime,
abstract_artigo text
*/

@Getter
@Setter
@Entity
@Table(name = "Artigo")
public class Artigo {
	
	@Id
	@Column(name = "id_artigo")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_artigo;
	
	@Column(name = "dt_artigo")
	private Date dt_artigo;
	
	@Column(name = "titulo_artigo")
	private String titulo_artigo;
	
	@Column(name = "resumo_artigo")
	private String resumo_artigo;
	
	@Column(name = "palavras_chave_artigo")
	private String palavras_chave_artigo;
	
	@Column(name = "abstract_artigo")
	private String abstract_artigo;
	
	@Column(name = "inativacao_artigo")
	private LocalDateTime inativacao_artigo;

	public void setInativacao_artigo(LocalDateTime now) {
		// TODO Auto-generated method stub
		
	}
	
	//ver como armazenar blob
}

