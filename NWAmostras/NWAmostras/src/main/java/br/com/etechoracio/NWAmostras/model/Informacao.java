package br.com.etechoracio.NWAmostras.model;

import java.time.LocalDateTime;

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
create table Informacao(
        	id_informacao serial constraint id_informacao_pk primary key,
        	conteudo_informacao text,
			foreign key (id_amostra) references Amostra (id_amostra),
			foreign key (id_campo) references Campo (id_campo),
			data_inativacao_informacao datetime
)
 */

@Getter
@Setter
@Entity
@Table(name = "Informacao")
public class Informacao {

	@Id
	@Column(name = "id_informacao")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_informacao;
	
	@Column(name = "conteudo_informacao")
	private String conteudo_informacao;
		
	@ManyToOne
	@JoinColumn(name = "id_amostra")
	private Amostra id_amostra;

	@ManyToOne
	@JoinColumn(name = "id_campo")
	private Campo id_campo;
	
	@Column(name = "data_inativacao_informacao")
	private LocalDateTime data_inativacao_informacao;

	public void setData_inativacao_informacao(LocalDateTime now) {
		
	}
}
