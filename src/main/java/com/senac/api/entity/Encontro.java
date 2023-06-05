package com.senac.api.entity;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "encontro")
public class Encontro implements Serializable{

	private static final long serialVersionUID = 1L;
		
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "encontro_id")
	private Long id;
	@Column(name = "encontro_observacao")
	private String observacao;
	@Column(name = "dia_letivo_id")
	private Long diaLetivoId;// Evento
	@Column(name = "grupo_id")
	private Long grupoId;// Evento
	@DateTimeFormat(pattern = "HH:mm")
	@Column(name = "encontro_data_inicio")
	private Date dataInicio;
	@DateTimeFormat(pattern = "HH:mm")
	@Column(name = "encontro_data_fim")
	private Date dataFim;
	@Column(name = "encontro_local")
	private String local;
	@Column(name = "encontro_status")
	private Boolean status;
	@OneToOne
	@JoinColumn(name = "encontro_tipo_id", referencedColumnName = "encontro_tipo_id")
	private EncontroTipo encontroTipoId;
	
	public Encontro() {
		super();
	}

	public Encontro(Long id, String observacao, Long diaLetivoId, Long grupoId, Date dataInicio, Date dataFim,
			String local, Boolean status, EncontroTipo encontroTipoId) {
		super();
		this.id = id;
		this.observacao = observacao;
		this.diaLetivoId = diaLetivoId;
		this.grupoId = grupoId;
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
		this.local = local;
		this.status = status;
		this.encontroTipoId = encontroTipoId;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getObservacao() {
		return observacao;
	}
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	public Long getDiaLetivoId() {
		return diaLetivoId;
	}
	public void setDiaLetivoId(Long diaLetivoId) {
		this.diaLetivoId = diaLetivoId;
	}
	public Long getGrupoId() {
		return grupoId;
	}
	public void setGrupoId(Long grupoId) {
		this.grupoId = grupoId;
	}
	public Date getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}
	public Date getDataFim() {
		return dataFim;
	}
	public void setDataFim(Date dataFim) {
		this.dataFim = dataFim;
	}
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	public Boolean getStatus() {
		return status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}
	public EncontroTipo getEncontroTipoId() {
		return encontroTipoId;
	}
	public void setEncontroTipoId(EncontroTipo encontroTipoId) {
		this.encontroTipoId = encontroTipoId;
	}
	
}
