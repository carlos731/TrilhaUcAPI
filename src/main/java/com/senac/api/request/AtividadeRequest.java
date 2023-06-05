package com.senac.api.request;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.validation.constraints.NotNull;

public class AtividadeRequest {
	
	private Long id;
	@NotNull(message = "O CAMPO DESCRIÇÃO DEVE SER PREENCHIDO!!")
	private String descricao;
	@NotNull(message = "O CAMPO DATA INICIO DEVE SER PREENCHIDO!!")
	@JsonFormat(pattern = "dd/MM/yyyy")
	private LocalDate dataInicio = LocalDate.now();
	@NotNull(message = "O CAMPO DURACAO DEVE SER PREENCHIDO!!")
	private Integer duracaoMinutos;
	@NotNull(message = "O CAMPO ORDEM DEVE SER PREENCHIDO!!")
	private Integer ordem;
	@NotNull(message = "O CAMPO STATUS DEVE SER PREENCHIDO!!")
	private Boolean status;
	@NotNull(message = "O CAMPO SITUAÇÃO APRENDIZAGEM DEVE SER PREENCHIDO!!")
	private Long situacaoAprendizagemId;
	@NotNull(message = "O CAMPO AVALIAÇÃO TIPO DEVE SER PREENCHIDO!!")
	private Long atividadeTipoId;
	@NotNull(message = "O CAMPO GRAU DIFICULDADE DEVE SER PREENCHIDO!!")
	private Long grauDificuldadeId;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public LocalDate getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(LocalDate dataInicio) {
		this.dataInicio = dataInicio;
	}
	public Integer getDuracaoMinutos() {
		return duracaoMinutos;
	}
	public void setDuracaoMinutos(Integer duracaoMinutos) {
		this.duracaoMinutos = duracaoMinutos;
	}
	public Integer getOrdem() {
		return ordem;
	}
	public void setOrdem(Integer ordem) {
		this.ordem = ordem;
	}
	public Boolean getStatus() {
		return status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}
	public Long getSituacaoAprendizagemId() {
		return situacaoAprendizagemId;
	}
	public void setSituacaoAprendizagemId(Long situacaoAprendizagemId) {
		this.situacaoAprendizagemId = situacaoAprendizagemId;
	}
	public Long getAtividadeTipoId() {
		return atividadeTipoId;
	}
	public void setAtividadeTipoId(Long atividadeTipoId) {
		this.atividadeTipoId = atividadeTipoId;
	}
	public Long getGrauDificuldadeId() {
		return grauDificuldadeId;
	}
	public void setGrauDificuldadeId(Long grauDificuldadeId) {
		this.grauDificuldadeId = grauDificuldadeId;
	}
	
}
