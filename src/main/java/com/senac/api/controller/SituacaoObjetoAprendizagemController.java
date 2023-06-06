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

import com.senac.api.entity.SituacaoObjetoAprendizagem;
import com.senac.api.request.SituacaoObjetoAprendizagemRequest;
import com.senac.api.response.SituacaoObjetoAprendizagemResponse;
import com.senac.api.service.SituacaoObjetoAprendizagemService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("api/situacaoObjetoAprendizagem")
public class SituacaoObjetoAprendizagemController {

	@Autowired
	private SituacaoObjetoAprendizagemService situacaoObjetoAprendizagemService;
	
	@PostMapping
	public ResponseEntity<SituacaoObjetoAprendizagemResponse> adicionar(@Valid @RequestBody SituacaoObjetoAprendizagemRequest situacaoObjetoAprendizagemReq){
		ModelMapper mapper = new ModelMapper();
		SituacaoObjetoAprendizagem situacaoObjetoAprendizagem = mapper.map(situacaoObjetoAprendizagemReq, SituacaoObjetoAprendizagem.class);
		situacaoObjetoAprendizagem = situacaoObjetoAprendizagemService.adicionar(situacaoObjetoAprendizagem);
		return new ResponseEntity<>(mapper.map(situacaoObjetoAprendizagem, SituacaoObjetoAprendizagemResponse.class), HttpStatus.CREATED);
	}
	
	@GetMapping
	public ResponseEntity<List<SituacaoObjetoAprendizagemResponse>> obterTodos(){
		List<SituacaoObjetoAprendizagem> situacaoObjetoAprendizagems = situacaoObjetoAprendizagemService.obterTodos();
		ModelMapper mapper = new ModelMapper();
		List<SituacaoObjetoAprendizagemResponse> resposta = situacaoObjetoAprendizagems.stream().map(situacaoObjetoAprendizagem -> mapper.map(situacaoObjetoAprendizagem, SituacaoObjetoAprendizagemResponse.class)).collect(Collectors.toList());
		return new ResponseEntity<>(resposta, HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Optional<SituacaoObjetoAprendizagemResponse>> obterPorId(@PathVariable Long id){
		Optional<SituacaoObjetoAprendizagem> situacaoObjetoAprendizagemEncontrado = situacaoObjetoAprendizagemService.obterPorId(id);
		SituacaoObjetoAprendizagemResponse situacaoObjetoAprendizagem = new ModelMapper().map(situacaoObjetoAprendizagemEncontrado.get(), SituacaoObjetoAprendizagemResponse.class);
		return new ResponseEntity<>(Optional.of(situacaoObjetoAprendizagem), HttpStatus.OK);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<SituacaoObjetoAprendizagemResponse> atualizar(@Valid @RequestBody SituacaoObjetoAprendizagemRequest situacaoObjetoAprendizagemReq, @PathVariable Long id){
		ModelMapper mapper = new ModelMapper();
		SituacaoObjetoAprendizagem situacaoObjetoAprendizagem = mapper.map(situacaoObjetoAprendizagemReq, SituacaoObjetoAprendizagem.class);
		situacaoObjetoAprendizagem = situacaoObjetoAprendizagemService.atualizar(id, situacaoObjetoAprendizagem);
		return new ResponseEntity<>(mapper.map(situacaoObjetoAprendizagem, SituacaoObjetoAprendizagemResponse.class), HttpStatus.OK);
		
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> deletar(@PathVariable Long id){
		situacaoObjetoAprendizagemService.deletar(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
}
