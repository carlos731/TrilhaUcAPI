package com.senac.api.request;

import jakarta.validation.constraints.NotNull;

public class AtividadeTipoRequest {
	
	private Long id;
	@NotNull(message = "O CAMPO DESCRICAO DEVE SER PREENCHIDO!!!")
	private String descricao;
	@NotNull(message = "O CAMPO STATUS DEVE SER PREENCHIDO!!!")
	private Boolean status;
	
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
	public Boolean getStatus() {
		return status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}	
	
}
