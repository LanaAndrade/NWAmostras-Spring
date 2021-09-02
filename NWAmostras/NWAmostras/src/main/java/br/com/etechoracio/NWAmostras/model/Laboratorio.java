package br.com.etechoracio.NWAmostras.model;


import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

/*
id_lab serial constraint id_lab_pk primary key,
telefone_lab varchar(15),
cnpj_lab char(18) unique,
nome_lab varchar (150),
data_inativacao_lab datetime,
endereco_lab varchar(1000) 
)
*/

@Getter
@Setter
@Entity
@Table(name = "Laboratorio")
public class Laboratorio {
	
	@Id
	@Column(name = "id_lab")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_lab;
	
	@Column(name = "telefone_lab")
	private String telefone_lab;
	
	@Column(name = "cnpj_lab")
	private char cnpj_lab;
	
	@Column(name = "nome_lab")
	private String nome_lab;
	
	@Column(name = "endereco_lab")
	private String endereco_lab;
	
	@Column(name = "data_inativacao_lab")
	private LocalDateTime data_inativacao_lab;
	
}