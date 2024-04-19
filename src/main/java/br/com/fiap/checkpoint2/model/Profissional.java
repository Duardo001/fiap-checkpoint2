package br.com.fiap.checkpoint2.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;


@Entity 
@Table(name = "profissionais")
public class Profissional extends AbstractEntity<Long>{
	
	@Column(name = "nome_do_profiossional", nullable = false, length = 60)
	private String nome;
	
	@Column(name = "especialidade", nullable = false, length = 30)
	private String especialidade;
	
	@Column(name = "valor_hora", columnDefinition = "NUMERIC(15,2)")
	private BigDecimal valorHora;
	
	@Column(name = "data_criacao", nullable = false, columnDefinition = "DATE")
	private LocalDateTime dataCriacao;
	
	@Column(name = "data_upload", nullable = false, columnDefinition = "DATE")
	private LocalDateTime dataUpload;
	
	
}
