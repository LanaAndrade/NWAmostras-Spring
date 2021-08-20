package br.com.etechoracio.NWAmostras.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import br.com.etechoracio.NWAmostras.enums.CargoPesquisadorEnum;
import br.com.etechoracio.NWAmostras.enums.TemaPesquisadorEnum;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Pesquisador")
public class Pesquisador {
	
	@Id
	@Column(name = "id_pesq")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_pesq;
	
	@Column(name = "senha_pesq")
	private String senha_pesq;
	
	@Column(name = "email_pesq")
	private String email_pesq;
	
	@Column(name = "nome_pesq")
	private String nome_pesq;
	
	@Column(name = "cpf_pesq")
	private char cpf_pesq;
	
	@Column(name = "cargo")
	@Enumerated(EnumType.ORDINAL)
	private CargoPesquisadorEnum cargo;
	
	@Column(name = "tema_claro_escuro")
	@Enumerated(EnumType.ORDINAL)
	private TemaPesquisadorEnum tema_claro_escuro;
}

