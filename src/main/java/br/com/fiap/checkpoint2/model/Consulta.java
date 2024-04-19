package br.com.fiap.checkpoint2.model;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity 
@Table(name = "consultas")
public class Consulta extends AbstractEntity<Long>{
	
	
	@Column(name = "status_consulta", nullable = false)
	private StatusConsulta statusConsulta;
	
	@Column(name = "quantidade_horas", columnDefinition = "NUMERIC(5,2)")
	private BigDecimal quantidadeHoras;

	@Column(name = "valor_consulta", columnDefinition = "NUMERIC(5,2)")
	private BigDecimal valorConsulta;
	
	@ManyToOne
	@JoinColumn(name = "profissional_id", nullable = false)
	private Profissional profiosionalId;
	
	@ManyToOne
	@JoinColumn(name = "paciente_id", nullable = false)
	private Paciente pacienteId;
}
