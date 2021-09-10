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

/*
create table Mapa_de_amostras(
        	id_mapa_amostra serial constraint id_mapa_amostra_pk primary key,
        	estante_mapa_amostra varchar(50),
        	nome_mapa_amostra varchar(150),
        	freezer_mapa_amostra varchar(50),
        	caixa_mapa_amostra varchar(50),
        	n_coluna_mapa_amostra numeric(30),
        	n_linha_mapa_amostra numeric(30),
        	foreign key (id_pesq) references Pesquisador (id_pesq)
)
 */

@Getter
@Setter
@Entity
@Table(name = "Mapa_de_amostras")
public class Mapa_de_amostras {

	@Id
	@Column(name = "id_mapa_amostra")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_mapa_amostra;
	
	@Column(name = "estante_mapa_amostra")
	private String estante_mapa_amostra;
	
	@Column(name = "nome_mapa_amostra")
	private String nome_mapa_amostra;	
	
	@Column(name = "freezer_mapa_amostra")
	private String freezer_mapa_amostra;	
	
	@Column(name = "caixa_mapa_amostra")
	private String caixa_mapa_amostra;	
	
	@Column(name = "n_coluna_mapa_amostra")
	private Integer n_coluna_mapa_amostra;	
	
	@Column(name = "n_linha_mapa_amostra")
	private Integer n_linha_mapa_amostra;
	
	@ManyToOne
	@JoinColumn(name = "id_pesq")
	private Pesquisador id_pesq;
}
