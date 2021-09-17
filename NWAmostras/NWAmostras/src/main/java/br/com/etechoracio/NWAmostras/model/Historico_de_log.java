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

import java.time.LocalDateTime;

/*
create table Historico_de_log(
        	id_histo_log serial constraint id_histo_log_pk primary key,
        	dt_hora_histo_log datetime,
        	mensagem_histo_log varchar(4000),
        	nivel_histo_log varchar(50),
        	logger_histo_log varchar(255),
        	exception_histo_log varchar(2000),
        	thread_histo_log varchar(255),
        	foreign key (id_lab) references Laboratorio (id_lab),
        	data_inativacao_hist_log datetime
) 
 */

@Getter
@Setter
@Entity
@Table(name = "Historico_de_log")
public class Historico_de_log {

	@Id
	@Column(name = "id_histo_log")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_histo_log;
	
	@Column(name = "dt_hora_histo")
	private LocalDateTime dt_hora_histo;
	
	@Column(name = "mensagem_histo_log")
	private String mensagem_histo_log;
	
	@Column(name = "nivel_histo_log")
	private String nivel_histo_log;
	
	@Column(name = "logger_histo_log")
	private String logger_histo_log;

	@Column(name = "exception_histo_log")
	private String exception_histo_log;
	
	@Column(name = "thread_histo_log")
	private String thread_histo_log;
	
	@ManyToOne
	@JoinColumn(name = "id_lab")
	private Laboratorio id_lab;
	
	@Column(name = "data_inativacao_hist_log")
	private LocalDateTime data_inativacao_hist_log;
}
