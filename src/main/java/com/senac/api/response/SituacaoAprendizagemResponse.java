package com.senac.api.response;

import java.time.LocalDate;
import java.util.List;

import com.senac.api.entity.GrauDificuldade;
import com.senac.api.entity.ObjetoAprendizagem;
import com.senac.api.entity.PlanejamentoUc;

public class SituacaoAprendizagemResponse{

	private Long id;
	private String titulo;
	private String descricao;
	private Integer ordem;
	private LocalDate inicio;
	private LocalDate fim;
	private Integer duracao;
	private Boolean status;
	private PlanejamentoUc planejamentoUcId;
	private GrauDificuldade grauDificuldadeId;
	private Long badgeId;
	private List<ObjetoAprendizagem> objetos;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Integer getOrdem() {
		return ordem;
	}
	public void setOrdem(Integer ordem) {
		this.ordem = ordem;
	}
	public LocalDate getInicio() {
		return inicio;
	}
	public void setInicio(LocalDate inicio) {
		this.inicio = inicio;
	}
	public LocalDate getFim() {
		return fim;
	}
	public void setFim(LocalDate fim) {
		this.fim = fim;
	}
	public Integer getDuracao() {
		return duracao;
	}
	public void setDuracao(Integer duracao) {
		this.duracao = duracao;
	}
	public Boolean getStatus() {
		return status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}
	public PlanejamentoUc getPlanejamentoUcId() {
		return planejamentoUcId;
	}
	public void setPlanejamentoUcId(PlanejamentoUc planejamentoUcId) {
		this.planejamentoUcId = planejamentoUcId;
	}
	public GrauDificuldade getGrauDificuldadeId() {
		return grauDificuldadeId;
	}
	public void setGrauDificuldadeId(GrauDificuldade grauDificuldadeId) {
		this.grauDificuldadeId = grauDificuldadeId;
	}
	public Long getBadgeId() {
		return badgeId;
	}
	public void setBadgeId(Long badgeId) {
		this.badgeId = badgeId;
	}
	public List<ObjetoAprendizagem> getObjetos() {
		return objetos;
	}
	public void setObjetos(List<ObjetoAprendizagem> objetos) {
		this.objetos = objetos;
	}
	
}
