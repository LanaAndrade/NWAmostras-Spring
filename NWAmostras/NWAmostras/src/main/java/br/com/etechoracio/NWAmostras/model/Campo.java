package br.com.etechoracio.NWAmostras.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

import java.sql.Date;
import java.sql.Time;

/*
create table Campo(
        	id_campo serial constraint id_campo_pk primary key,
        	nome_campo varchar(256),
        	tipo_dados varchar(256),
			foreign key (id_pesq) references Pesquisador (id_pesq),
			foreign key (id_projeto) references Projeto (id_projeto)
)
 */

@Getter
@Setter
@Entity
@Table(name = "Campo")
public class Campo {

	@Id
	@Column(name = "id_campo")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_campo;
	
	@Column(name = "nome_campo")
	private String nome_campo;
	
	@Column(name = "tipo_dados")
	private String tipo_dados;
	
	@ManyToOne
	@JoinColumn(name = "id_pesq")
	private Pesquisador id_pesq;
	
	@ManyToOne
	@JoinColumn(name = "id_projeto")
	private Projeto id_projeto;
}