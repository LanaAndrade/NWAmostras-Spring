package br.com.etechoracio.NWAmostras.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import br.com.etechoracio.NWAmostras.enums.TipoAmostraEnum;
import lombok.Getter;
import lombok.Setter;

/*
create table Amostra(
		id_amostra serial constraint id_amostra_pk primary key,
		coletador_amostra varchar(150),								
		anotacoes_amostra varchar(250),
		tipo_amostra varchar(150),
		foreign key (id_categoria) references Categoria (id_categoria),
		foreign key (id_origem) references Origem (id_origem),
		data_inativacao_amostra datetime
)
*/

@Getter
@Setter
@Entity
@Table(name = "Amostra")
public class Amostra {
	@Id
	@Column(name = "id_amostra")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_amostra;
	
	@Column(name = "coletador_amostra")
	private String coletador_amostra;
	
	@Column(name = "anotacoes_amostra")
	private String anotacoes_amostra;
	
	@Column(name = "tipo_amostra")
	@Enumerated(EnumType.STRING)
	private TipoAmostraEnum tipo_amostra;
	
	@ManyToOne
	@JoinColumn(name = "id_categoria")
	private Categoria id_categoria;

	@ManyToOne
	@JoinColumn(name = "id_origem")
	private Origem id_origem;
	
	@Column(name = "data_inativacao_amostra")
	private LocalDateTime data_inativacao_amostra;
}
