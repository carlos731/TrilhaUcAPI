package com.senac.api.response;

import com.senac.api.entity.ObjetoAprendizagem;
import com.senac.api.entity.SituacaoAprendizagem;

public class SituacaoObjetoAprendizagemResponse {
	
	private Long id;
	private Integer order;
	private SituacaoAprendizagem situacaoAprendizagemId;
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
