package com.senac.api.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senac.api.entity.Atividade;
import com.senac.api.exception.ObjectnotFoundException;
import com.senac.api.repository.AtividadeRepository;

@Service
public class AtividadeService {
	
	@Autowired
	private AtividadeRepository atividadeRepository;
	
	public Atividade adicionar(Atividade atividade) {
		atividade.setId(null);
		atividade.setStatus(true);
		atividade = atividadeRepository.save(atividade);
		atividade.setId(atividade.getId());
		return atividade;
	}
	
	public List<Atividade> obterTodos(){
		List<Atividade> cursos = atividadeRepository.findAll();
		return cursos;
	}
	
	public Optional<Atividade> obterPorId(Long id){
		Optional<Atividade> curso = atividadeRepository.findById(id);
		
		if(curso.isEmpty()) {
			throw new ObjectnotFoundException("CURSO COM ID : '" + id + "' NÃO ENCONTRADO!");
		}
		
		return curso;
	}
	
	public Atividade atualizar(Long id, Atividade atividade) {
		Optional<Atividade> cursoId = atividadeRepository.findById(id);
		
		if(cursoId.isEmpty()) {
			throw new ObjectnotFoundException("CURSO COM ID: '" + id + "' NÃO ENCONTRADO!");
		}
		
		atividade.setId(id);
		atividade.setId(id);
		atividadeRepository.save(atividade);
		return atividade;
	}
	
	
	public void deletar(Long id) {
		Optional<Atividade> atividade = atividadeRepository.findById(id);
		
		if(atividade.isEmpty()) {
			throw new ObjectnotFoundException("CURSO COM ID: '\" + id + \"' NÃO ENCONTRADO!");
		}
		
		atividadeRepository.deleteById(id);
	}
}
