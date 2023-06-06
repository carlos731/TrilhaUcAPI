package com.senac.api.DBService;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senac.api.entity.Encontro;
import com.senac.api.entity.EncontroTipo;
import com.senac.api.entity.GrauDificuldade;
import com.senac.api.entity.PlanejamentoUc;
import com.senac.api.repository.EncontroRepository;
import com.senac.api.repository.EncontroTipoRepository;
import com.senac.api.repository.GrauDificuldadeRepository;
import com.senac.api.repository.PlanejamentoUcRepository;

@Service
public class DBService {
	
	@Autowired
	private PlanejamentoUcRepository planejamentoUcRepository;
	
	@Autowired
	private GrauDificuldadeRepository grauDificuldadeRepository;
	
	@Autowired 
	private EncontroTipoRepository encontroTipoRepository;
	
	@Autowired
	private EncontroRepository encontroRepository;
	
	public void instanciaDB() {	

		//Planejamento
		PlanejamentoUc planejamentoUc1 = new PlanejamentoUc((long) 1, "Planejamento 1", null, true, (long) 1);
		planejamentoUcRepository.saveAll(Arrays.asList(planejamentoUc1));
		
		//grau_dificuldade
		GrauDificuldade grau1 = new GrauDificuldade(null, "Fácil", true);
		GrauDificuldade grau2 = new GrauDificuldade(null, "Intermediário", true);
		GrauDificuldade grau3 = new GrauDificuldade(null, "Dificil", true);
		grauDificuldadeRepository.saveAll(Arrays.asList(grau1, grau2, grau3));
		
		//encontro_tipo
		EncontroTipo encontroTipo1 = new EncontroTipo(null, "Encontro tipo 1", true);
		EncontroTipo encontroTipo2 = new EncontroTipo(null, "Encontro tipo 2", true);
		EncontroTipo encontroTipo3 = new EncontroTipo(null, "Encontro tipo 3", true);
		encontroTipoRepository.saveAll(Arrays.asList(encontroTipo1, encontroTipo2, encontroTipo3));
		
		//encontro
		Encontro encontro1 = new Encontro(null, "Aula 1", (long) 1, (long) 1, null, null, "Sala 306", true, encontroTipo1);
		encontroRepository.saveAll(Arrays.asList(encontro1));
		
		//atividade_tipo
		
		//situacao_aprendizagem
		//List<CopetenciaIndicador> indicadores = new ArrayList<>();
		//indicadores.add(ind1);
		//List<CopetenciaIndicador> indicadores2 = new ArrayList<>();
		//indicadores2.add(ind1);
		//indicadores2.add(ind2);
		//SituacaoAprendizagem st1 = new SituacaoAprendizagem(null, "Conceitos de lógica básica", "Professor apresenta o conceito de lógica básica de programação", 1, true, planejamentoUc1, grau1, badge1, indicadores);
		//SituacaoAprendizagem st2 = new SituacaoAprendizagem(null, "Instalação de IDE de programação Pycharm", "Professor explica como instalar a IDE Pycharm para programação", 1, true, planejamentoUc1, grau1, badge1, indicadores2);
		//situacaoAprendizagemRepository.saveAll(Arrays.asList(st1, st2));
		
		
	}
	
}
