package com.senac.api.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senac.api.entity.SituacaoObjetoAprendizagem;
import com.senac.api.exception.ObjectnotFoundException;
import com.senac.api.repository.SituacaoObjetoAprendizagemRepository;

@Service
public class SituacaoObjetoAprendizagemService {

	@Autowired
	private SituacaoObjetoAprendizagemRepository situacaoObjetoAprendizagemRepository;
	
	public SituacaoObjetoAprendizagem adicionar(SituacaoObjetoAprendizagem situacaoObjetoAprendizagem) {
		situacaoObjetoAprendizagem.setId(null);
		situacaoObjetoAprendizagem = situacaoObjetoAprendizagemRepository.save(situacaoObjetoAprendizagem);
		situacaoObjetoAprendizagem.setId(situacaoObjetoAprendizagem.getId());
		System.out.println("Situacao_aprendizagem_id: " + situacaoObjetoAprendizagem.getId());
		return situacaoObjetoAprendizagem;
	}
	
	public List<SituacaoObjetoAprendizagem> obterTodos(){
		List<SituacaoObjetoAprendizagem> situacaoObjetoAprendizagems = situacaoObjetoAprendizagemRepository.findAll();
		return situacaoObjetoAprendizagems;
	}
	
	public Optional<SituacaoObjetoAprendizagem> obterPorId(Long id){
		Optional<SituacaoObjetoAprendizagem> situacaoObjetoAprendizagem = situacaoObjetoAprendizagemRepository.findById(id);
		
		if(situacaoObjetoAprendizagem.isEmpty()) {
			throw new ObjectnotFoundException("SITUAÇÃO OBJETO APRENDIZAGEM COM ID : '" + id + "' NÃO ENCONTRADO!");
		}

		return situacaoObjetoAprendizagem;
	}
	
	public SituacaoObjetoAprendizagem atualizar(Long id, SituacaoObjetoAprendizagem situacaoObjetoAprendizagem) {
		Optional<SituacaoObjetoAprendizagem> situacaoObjetoAprendizagemId = situacaoObjetoAprendizagemRepository.findById(id);
		
		if(situacaoObjetoAprendizagemId.isEmpty()) {
			throw new ObjectnotFoundException("SITUAÇÃO OBJETO APRENDIZAGEM COM ID: '" + id + "' NÃO ENCONTRADO!");
		}
		
		situacaoObjetoAprendizagem.setId(id);
		situacaoObjetoAprendizagem.setId(id);
		situacaoObjetoAprendizagemRepository.save(situacaoObjetoAprendizagem);
		return situacaoObjetoAprendizagem;
	}
	
	
	public void deletar(Long id) {
		Optional<SituacaoObjetoAprendizagem> situacaoObjetoAprendizagem = situacaoObjetoAprendizagemRepository.findById(id);
		
		if(situacaoObjetoAprendizagem.isEmpty()) {
			throw new ObjectnotFoundException("SITUAÇÃO OBJETO APRENDIZAGEM COM ID: " + id + " NÃO ENCONTRADO!");
		}
		
		situacaoObjetoAprendizagemRepository.deleteById(id);
	}
	
	public void deletarByObjeto(Long id) {
		Optional<SituacaoObjetoAprendizagem> situacaoObjetoAprendizagem = situacaoObjetoAprendizagemRepository.findByObjeto(id);
		
		if(situacaoObjetoAprendizagem.isEmpty()) {
			throw new ObjectnotFoundException("SITUAÇÃO OBJETO APRENDIZAGEM COM ID: " + id + " NÃO ENCONTRADO!");
		}
		
		situacaoObjetoAprendizagemRepository.deleteById(situacaoObjetoAprendizagem.get().getId());
	}
	
	public void deletarBySituacao(Long id) {
		Optional<SituacaoObjetoAprendizagem> situacaoObjetoAprendizagem = situacaoObjetoAprendizagemRepository.findBySituacao(id);
		
		if(situacaoObjetoAprendizagem.isEmpty()) {
			throw new ObjectnotFoundException("SITUAÇÃO OBJETO APRENDIZAGEM COM ID: " + id + " NÃO ENCONTRADO!");
		}
		
		situacaoObjetoAprendizagemRepository.deleteById(situacaoObjetoAprendizagem.get().getId());
	}
	
}
