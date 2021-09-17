package br.com.etechoracio.NWAmostras.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import br.com.etechoracio.NWAmostras.enums.Privado_publicoProjeto;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;
import java.time.LocalDateTime;

/*
create table Projeto(
        	id_projeto serial constraint id_projeto_pk primary key,
        	dt_termino_projeto date,
        	nome_projeto varchar(150),
        	dt_inicio_projeto date,
        	privado_publico_projeto int
        	inativacao_projeto datetime;
)
 */

@Getter
@Setter
@Entity
@Table(name = "Projeto")
public class Projeto {

	@Id
	@Column(name = "id_projeto")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_projeto;
	
	@Column(name = "dt_termino_projeto")
	private Date dt_termino_projeto;
	
	@Column(name = "nome_projeto")
	private String nome_projeto;
	
	@Column(name = "dt_inicio_projeto")
	private Date dt_inicio_projeto;
	
	@Column(name = "privado_publico_projeto")
	@Enumerated(EnumType.ORDINAL)
	private Privado_publicoProjeto privado_publico_projeto;
	
	@Column(name = "inativacao_projeto")
	private LocalDateTime inativacao_projeto;


}
