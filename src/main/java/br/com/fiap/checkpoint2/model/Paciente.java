package br.com.fiap.checkpoint2.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "pacientes")
public class Paciente extends AbstractEntity<Long>{
	
	@Column(name = "nome_paciente", nullable = false, length = 60)
	private String nome;
	
	@Column(name = "endereco", length = 60)
	private String endereco;
	
	@Column(name = "bairro", length = 30)
	private String bairro;
	
	@Column(name = "email", length = 40)
	private String email;
	
	@Column(name = "telefone_completo", length = 13)
	private String telefone;
	
	@Column(name = "dt_nascimento", nullable = false, columnDefinition = "DATE")
	private LocalDate dataNascimento;
	
	@Column(name = "data_criacao", nullable = false, columnDefinition = "DATE")
	private LocalDateTime dataCriacao;
	
	@Column(name = "data_upload", nullable = false, columnDefinition = "DATE")
	private LocalDateTime dataUpload;
	

}
