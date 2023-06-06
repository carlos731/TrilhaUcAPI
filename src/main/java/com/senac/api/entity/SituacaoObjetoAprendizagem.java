package com.senac.api.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "situacao_objeto_aprendizagem")
public class SituacaoObjetoAprendizagem implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "situacao_objeto_aprendizagem_id")
	private Long id;
	@Column(name = "situacao_objeto_aprendizagem_ordem")
	private Integer order;
	@ManyToOne
	@JoinColumn(name = "situacao_aprendizagem_id", referencedColumnName = "situacao_aprendizagem_id")
	private SituacaoAprendizagem situacaoAprendizagemId;
	@ManyToOne
	@JoinColumn(name = "objeto_aprendizagem_id", referencedColumnName = "objeto_aprendizagem_id")
	private ObjetoAprendizagem objetoAprendizagemId;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Integer getOrder() {
		return order;
	}
	public void setOrder(Integer order) {
		this.order = order;
	}
	public SituacaoAprendizagem getSituacaoAprendizagemId() {
		return situacaoAprendizagemId;
	}
	public void setSituacaoAprendizagemId(SituacaoAprendizagem situacaoAprendizagemId) {
		this.situacaoAprendizagemId = situacaoAprendizagemId;
	}
	public ObjetoAprendizagem getObjetoAprendizagemId() {
		return objetoAprendizagemId;
	}
	public void setObjetoAprendizagemId(ObjetoAprendizagem objetoAprendizagemId) {
		this.objetoAprendizagemId = objetoAprendizagemId;
	}
	
	
}
