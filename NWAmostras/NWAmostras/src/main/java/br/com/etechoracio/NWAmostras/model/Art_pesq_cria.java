package br.com.etechoracio.NWAmostras.model;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

/*
create table Art_pesq_cria(
		foreign key (id_pesq) references Pesquisador (id_pesq),
		foreign key (id_artigo) references Artigo (id_artigo)
)
 */

@Getter
@Setter
@Entity
@Table(name = "Art_pesq_cria")
public class Art_pesq_cria {

	@ManyToOne
	@JoinColumn(name = "id_pesq")
	private Pesquisador id_pesq;
	
	@ManyToOne
	@JoinColumn(name = "id_artigo")
	private Artigo id_artigo;
}
