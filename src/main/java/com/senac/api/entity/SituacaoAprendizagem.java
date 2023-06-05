package com.senac.api.entity;

import java.io.Serializable;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "situacao_aprendizagem")
public class SituacaoAprendizagem implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "situacao_aprendizagem_id")
	private Long id;
	@Column(name = "situacao_aprendizagem_titulo")
	private String titulo;
	@Column(name = "situacao_aprendizagem_descricao")
	private String descricao;
	@Column(name = "situacao_aprendizagem_ordem")
	private Integer ordem;
	@Column(name = "situacao_aprendizagem_inicio")
	private LocalDate inicio = LocalDate.now();
	@Column(name = "situacao_aprendizagem_fim")
	private LocalDate fim;
	@Column(name = "situacao_aprendizagem_duracao")
	private Integer duracao;
	@Column(name = "situacao_aprendizagem_status")
	private Boolean status;
	@ManyToOne
	@JoinColumn(name = "planejamento_uc_id", referencedColumnName = "planejamento_uc_id")
	private PlanejamentoUc planejamentoUcId;
	@OneToOne
	@JoinColumn(name = "grau_dificuldade_id", referencedColumnName = "grau_dificuldade_id")
	private GrauDificuldade grauDificuldadeId;
	@Column(name = "badge_id")
	private Long badgeId;
	
	public SituacaoAprendizagem() {
		super();
	}

	public SituacaoAprendizagem(Long id, String titulo, String descricao, Integer ordem, Boolean status,
			PlanejamentoUc planejamentoUcId, GrauDificuldade grauDificuldadeId, Long badgeId) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.descricao = descricao;
		this.ordem = ordem;
		this.status = status;
		this.planejamentoUcId = planejamentoUcId;
		this.grauDificuldadeId = grauDificuldadeId;
		this.badgeId = badgeId;
	}
	
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


}
