package com.senac.api.response;

import java.time.LocalDate;

import com.senac.api.entity.AtividadeTipo;
import com.senac.api.entity.GrauDificuldade;
import com.senac.api.entity.SituacaoAprendizagem;

public class AtividadeResponse {
	
	private Long id;
	private String descricao;
	private LocalDate dataInicio = LocalDate.now();
	private Integer duracaoMinutos;
	private Integer ordem;
	private Boolean status;
	private SituacaoAprendizagem situacaoAprendizagemId;
	private AtividadeTipo atividadeTipoId;
	private GrauDificuldade grauDificuldadeId;
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
	public SituacaoAprendizagem getSituacaoAprendizagemId() {
		return situacaoAprendizagemId;
	}
	public void setSituacaoAprendizagemId(SituacaoAprendizagem situacaoAprendizagemId) {
		this.situacaoAprendizagemId = situacaoAprendizagemId;
	}
	public AtividadeTipo getAtividadeTipoId() {
		return atividadeTipoId;
	}
	public void setAtividadeTipoId(AtividadeTipo atividadeTipoId) {
		this.atividadeTipoId = atividadeTipoId;
	}
	public GrauDificuldade getGrauDificuldadeId() {
		return grauDificuldadeId;
	}
	public void setGrauDificuldadeId(GrauDificuldade grauDificuldadeId) {
		this.grauDificuldadeId = grauDificuldadeId;
	}
	
	
}
