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
import java.time.LocalDateTime;

/*
create table Amostra_no_Mapa_contem(
        	id_amostra_mapa serial constraint id_amostra_mapa_pk primary key,
        	id_div_mapa_amostra int,
        	n_coluna_amostra numeric(30),
        	n_linha_amostra numeric(30),
        	validade_amostra date,
        	dt_coleta_amostra date,
        	volume_amostra decimal (8,2),
        	hora_coleta_amostra time,
        	foreign key (id_amostra) references Amostra (id_amostra),
        	foreign key (id_mapa_amostra) references Mapa_de_amostras (id_mapa_amostra),
        	data_inativacao_amostra_no_mapa_contem datetime
)
 */

@Getter
@Setter
@Entity
@Table(name = "Amostra_no_Mapa_contem")
public class Amostra_no_Mapa_contem {

	@Id
	@Column(name = "id_amostra_mapa")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_amostra_mapa;
	
	@Column(name = "id_div_mapa_amostra")
	private String id_div_mapa_amostra;
	
	@Column(name = "n_coluna_amostra")
	private Integer n_coluna_amostra;
	
	@Column(name = "n_linha_amostra")
	private Integer n_linha_amostra;
	
	@Column(name = "validade_amostra")
	private Date validade_amostra;
	
	@Column(name = "dt_coleta_amostra")
	private Date dt_coleta_amostra;
	
	@Column(name = "volume_amostra")
	private Double volume_amostra;
	
	@Column(name = "hora_coleta_amostra")
	private Time hora_coleta_amostra;
	
	@ManyToOne
	@JoinColumn(name = "id_amostra")
	private Amostra id_amostra;
	
	@ManyToOne
	@JoinColumn(name = "id_mapa_amostra")
	private Mapa_de_amostras id_mapa_amostra;

	@Column(name = "data_inativacao_amostra_no_mapa_contem")
	private LocalDateTime data_inativacao_amostra_no_mapa_contem;
	
}
