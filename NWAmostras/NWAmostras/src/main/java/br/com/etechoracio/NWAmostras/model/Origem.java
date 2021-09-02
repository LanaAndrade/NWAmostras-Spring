package br.com.etechoracio.NWAmostras.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

/*
create table Origem(
		id_origem serial constraint id_origem_pk primary key,
		endereco_origem varchar(1000)
) 
*/

@Getter
@Setter
@Entity
@Table(name = "Origem")
public class Origem {
	@Id
	@Column(name = "id_origem")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_origem;
	
	@Column(name = "endereco_origem")
	private String endereco_origem;
}
