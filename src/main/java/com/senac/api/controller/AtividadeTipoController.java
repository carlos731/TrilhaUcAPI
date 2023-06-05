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

import com.senac.api.entity.AtividadeTipo;
import com.senac.api.request.AtividadeTipoRequest;
import com.senac.api.response.AtividadeTipoResponse;
import com.senac.api.service.AtividadeTipoService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("api/atividadeTipo")
public class AtividadeTipoController {

	@Autowired
	private AtividadeTipoService atividadeTipoService;
	
	@PostMapping
	public ResponseEntity<AtividadeTipoResponse> adicionar(@Valid @RequestBody AtividadeTipoRequest atividadeTipoReq){
		ModelMapper mapper = new ModelMapper();
		AtividadeTipo atividadeTipo = mapper.map(atividadeTipoReq, AtividadeTipo.class);
		atividadeTipo = atividadeTipoService.adicionar(atividadeTipo);
		return new ResponseEntity<>(mapper.map(atividadeTipo, AtividadeTipoResponse.class), HttpStatus.CREATED);
	}
	
	@GetMapping
	public ResponseEntity<List<AtividadeTipoResponse>> obterTodos(){
		List<AtividadeTipo> atividades = atividadeTipoService.obterTodos();
		ModelMapper mapper = new ModelMapper();
		List<AtividadeTipoResponse> resposta = atividades.stream().map(atividadeTipo -> mapper.map(atividadeTipo, AtividadeTipoResponse.class)).collect(Collectors.toList());
		return new ResponseEntity<>(resposta, HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Optional<AtividadeTipoResponse>> obterPorId(@PathVariable Long id){
		Optional<AtividadeTipo> atividadeTipoEncontrado = atividadeTipoService.obterPorId(id);
		AtividadeTipoResponse atividadeTipo = new ModelMapper().map(atividadeTipoEncontrado.get(), AtividadeTipoResponse.class);
		return new ResponseEntity<>(Optional.of(atividadeTipo), HttpStatus.OK);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<AtividadeTipoResponse> atualizar(@Valid @RequestBody AtividadeTipoRequest atividadeTipoReq, @PathVariable Long id){
		ModelMapper mapper = new ModelMapper();
		AtividadeTipo atividadeTipo = mapper.map(atividadeTipoReq, AtividadeTipo.class);
		atividadeTipo = atividadeTipoService.atualizar(id, atividadeTipo);
		return new ResponseEntity<>(mapper.map(atividadeTipo, AtividadeTipoResponse.class), HttpStatus.OK);
		
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> deletar(@PathVariable Long id){
		atividadeTipoService.deletar(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
}
