package com.senac.api.request;

import jakarta.validation.constraints.NotNull;

public class SituacaoObjetoAprendizagemRequest {
	
	private Long id;
	@NotNull(message = "O campo order deve ser preenchido!!")
	private Integer order;
	@NotNull(message = "O campo situacaoAprendizagemId deve ser preenchido!!")
	private Long situacaoAprendizagemId;
	@NotNull(message = "O campo objetoAprendizagemId deve ser preenchido!!")
	private Long objetoAprendizagemId;
	
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
	public Long getSituacaoAprendizagemId() {
		return situacaoAprendizagemId;
	}
	public void setSituacaoAprendizagemId(Long situacaoAprendizagemId) {
		this.situacaoAprendizagemId = situacaoAprendizagemId;
	}
	public Long getObjetoAprendizagemId() {
		return objetoAprendizagemId;
	}
	public void setObjetoAprendizagemId(Long objetoAprendizagemId) {
		this.objetoAprendizagemId = objetoAprendizagemId;
	}
	
}
