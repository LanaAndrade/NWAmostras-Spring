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

/*
create table Historico_de_Acesso_vizualiza(
        	id_hist_acesso serial constraint id_hist_acesso_pk primary key,
        	dt_hist_acesso date,
			foreign key (id_projeto) references Projeto (id_projeto),
			foreign key (id_pesq) references Pesquisador (id_pesq)
)
 */

@Getter
@Setter
@Entity
@Table(name = "Historico_de_Acesso_vizualiza")
public class Historico_de_Acesso_vizualiza {

	@Id
	@Column(name = "id_hist_acesso")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_hist_acesso;
	
	@Column(name = "dt_hist_acesso")
	private Date dt_hist_acesso;
	
	@ManyToOne
	@JoinColumn(name = "id_projeto")
	private Projeto id_projeto;

	@ManyToOne
	@JoinColumn(name = "id_pesq")
	private Pesquisador id_pesq;
}
