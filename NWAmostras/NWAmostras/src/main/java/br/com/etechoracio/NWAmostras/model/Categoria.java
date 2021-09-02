package br.com.etechoracio.NWAmostras.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/*
create table Categoria(
	id_categoria serial constraint id_categoria_pk primary key,
	nome_categoria varchar(10)
)
*/

public class Categoria {
	@Id
	@Column(name = "id_categoria")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_categoria;
	
	@Column(name = "nome_categoria")
	private String nome_categoria;

}
