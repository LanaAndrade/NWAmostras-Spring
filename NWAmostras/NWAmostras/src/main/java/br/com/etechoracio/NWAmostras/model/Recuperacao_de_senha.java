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
create table Recuperacao_de_senha(
        	id_rec_senha serial constraint id_rec_senha_pk primary key,
			foreign key (id_pesq) references Pesquisador (id_pesq),
			data_inativacao_rec_senha datetime
 */

@Getter
@Setter
@Entity
@Table(name = "Recuperacao_de_senha")
public class Recuperacao_de_senha {

	@Id
	@Column(name = "id_rec_senha")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_rec_senha;
	
	@ManyToOne
	@JoinColumn(name = "id_pesq")
	private Pesquisador id_pesq;
	
	@Column(name = "data_inativacao_rec_senha")
	private LocalDateTime data_inativacao_rec_senha;

	public void setData_inativacao_rec_senha(LocalDateTime now) {
		
	}	

}
