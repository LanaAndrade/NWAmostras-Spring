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
import java.time.LocalDateTime;

/*
create table Historico_da_amostra_utiliza(
        	id_hist_amostra serial constraint id_hist_amostra_pk primary key,
        	quant_hist_amostra decimal(8,2),
        	dt_hist_amostra date,
        	foreign key (id_amostra) references Amostra (id_amostra),
			foreign key (id_pesq) references Pesquisador (id_pesq),
			data_inativacao_hist_amostra datetime
)
 */

@Getter
@Setter
@Entity
@Table(name = "Historico_da_amostra_utiliza")
public class Historico_da_amostra_utiliza {

	@Id
	@Column(name = "id_hist_amostra")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_hist_amostra;
	
	@Column(name = "quant_hist_amostra")
	private Double quant_hist_amostra;

	@Column(name = "dt_hist_amostra")
	private Date dt_hist_amostra;
	
	@ManyToOne
	@JoinColumn(name = "id_amostra")
	private Amostra id_amostra;

	@ManyToOne
	@JoinColumn(name = "id_pesq")
	private Pesquisador id_pesq;

	@Column(name = "data_inativacao_hist_amostra")
	private LocalDateTime data_inativacao_hist_amostra;
	
	public void setData_inativacao_hist_amostra(LocalDateTime now) {
		
	}
}
