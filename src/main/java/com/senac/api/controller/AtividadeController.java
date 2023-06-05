package com.senac.api.controller;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senac.api.entity.Atividade;
import com.senac.api.request.AtividadeRequest;
import com.senac.api.response.AtividadeResponse;
import com.senac.api.service.AtividadeService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("api/atividade")
public class AtividadeController {
	
	@Autowired
	private AtividadeService atividadeService;
	
	@PostMapping
	public ResponseEntity<AtividadeResponse> adicionar(@Valid @RequestBody AtividadeRequest atividadeReq){
		ModelMapper mapper = new ModelMapper();
		Atividade atividade = mapper.map(atividadeReq, Atividade.class);
		atividade = atividadeService.adicionar(atividade);
		return new ResponseEntity<>(mapper.map(atividade, AtividadeResponse.class), HttpStatus.CREATED);
	}
	
	@GetMapping
	public ResponseEntity<List<AtividadeResponse>> obterTodos(){
		List<Atividade> atividades = atividadeService.obterTodos();
		ModelMapper mapper = new ModelMapper();
		List<AtividadeResponse> resposta = atividades.stream().map(atividade -> mapper.map(atividade, AtividadeResponse.class)).collect(Collectors.toList());
		return new ResponseEntity<>(resposta, HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Optional<AtividadeResponse>> obterPorId(@PathVariable Long id){
		Optional<Atividade> atividadeEncontrado = atividadeService.obterPorId(id);
		AtividadeResponse atividade = new ModelMapper().map(atividadeEncontrado.get(), AtividadeResponse.class);
		return new ResponseEntity<>(Optional.of(atividade), HttpStatus.OK);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<AtividadeResponse> atualizar(@Valid @RequestBody AtividadeRequest atividadeReq, @PathVariable Long id){
		ModelMapper mapper = new ModelMapper();
		Atividade atividade = mapper.map(atividadeReq, Atividade.class);
		atividade = atividadeService.atualizar(id, atividade);
		return new ResponseEntity<>(mapper.map(atividade, AtividadeResponse.class), HttpStatus.OK);
		
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> deletar(@PathVariable Long id){
		atividadeService.deletar(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
}
