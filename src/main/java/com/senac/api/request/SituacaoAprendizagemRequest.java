package com.senac.api.request;

import jakarta.validation.constraints.NotNull;

public class SituacaoAprendizagemRequest{

	private Long id;
	@NotNull(message = "O campo titulo deve ser preenchido!!")
	private String titulo;
	@NotNull(message = "O campo descricao deve ser preenchido!!")
	private String descricao;
	@NotNull(message = "O campo ordem deve ser preenchido!!")
	private Integer ordem;
	@NotNull(message = "O campo duração deve ser preenchido!!")
	private Integer duracao;
	@NotNull(message = "O campo status deve ser preenchido!!")
	private Integer status;
	@NotNull(message = "O campo planejamento da uc deve ser preenchido!!")
	private Long planejamentoUcId;
	@NotNull(message = "O campo graud e dificuldade deve ser preenchido!!")
	private Long grauDificuldadeId;
	@NotNull(message = "O campo badge deve ser preenchido!!")
	private Long badgeId;
	@NotNull(message = "O campo indicador deve ser preenchido!!")
	private Long indicadorId;
	
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
	public Integer getDuracao() {
		return duracao;
	}
	public void setDuracao(Integer duracao) {
		this.duracao = duracao;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Long getPlanejamentoUcId() {
		return planejamentoUcId;
	}
	public void setPlanejamentoUcId(Long planejamentoUcId) {
		this.planejamentoUcId = planejamentoUcId;
	}
	public Long getGrauDificuldadeId() {
		return grauDificuldadeId;
	}
	public void setGrauDificuldadeId(Long grauDificuldadeId) {
		this.grauDificuldadeId = grauDificuldadeId;
	}
	public Long getBadgeId() {
		return badgeId;
	}
	public void setBadgeId(Long badgeId) {
		this.badgeId = badgeId;
	}
	public Long getIndicadorId() {
		return indicadorId;
	}
	public void setIndicadorId(Long indicadorId) {
		this.indicadorId = indicadorId;
	}
	
	
}
