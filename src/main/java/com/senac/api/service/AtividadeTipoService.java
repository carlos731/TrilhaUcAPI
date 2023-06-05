package com.senac.api.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senac.api.entity.AtividadeTipo;
import com.senac.api.exception.ObjectnotFoundException;
import com.senac.api.repository.AtividadeTipoRepository;

@Service
public class AtividadeTipoService {

	@Autowired
	private AtividadeTipoRepository atividadeTipoRepository;
	
	public AtividadeTipo adicionar(AtividadeTipo atividadeTipo) {
		atividadeTipo.setId(null);
		atividadeTipo.setStatus(true);
		atividadeTipo = atividadeTipoRepository.save(atividadeTipo);
		atividadeTipo.setId(atividadeTipo.getId());
		return atividadeTipo;
	}
	
	public List<AtividadeTipo> obterTodos(){
		List<AtividadeTipo> cursos = atividadeTipoRepository.findAll();
		return cursos;
	}
	
	public Optional<AtividadeTipo> obterPorId(Long id){
		Optional<AtividadeTipo> curso = atividadeTipoRepository.findById(id);
		
		if(curso.isEmpty()) {
			throw new ObjectnotFoundException("CURSO COM ID : '" + id + "' NÃO ENCONTRADO!");
		}
		
		return curso;
	}
	
	public AtividadeTipo atualizar(Long id, AtividadeTipo atividadeTipo) {
		Optional<AtividadeTipo> cursoId = atividadeTipoRepository.findById(id);
		
		if(cursoId.isEmpty()) {
			throw new ObjectnotFoundException("CURSO COM ID: '" + id + "' NÃO ENCONTRADO!");
		}
		
		atividadeTipo.setId(id);
		atividadeTipo.setId(id);
		atividadeTipoRepository.save(atividadeTipo);
		return atividadeTipo;
	}
	
	
	public void deletar(Long id) {
		Optional<AtividadeTipo> atividadeTipo = atividadeTipoRepository.findById(id);
		
		if(atividadeTipo.isEmpty()) {
			throw new ObjectnotFoundException("CURSO COM ID: '\" + id + \"' NÃO ENCONTRADO!");
		}
		
		atividadeTipoRepository.deleteById(id);
	}
	
}
