package com.senac.api.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.senac.api.entity.IndicadorSituacaoAprendizagem;

@Repository
public interface IndicadorSituacaoAprendizagemRepository extends JpaRepository<IndicadorSituacaoAprendizagem, Long>{
	
	@Query(value = "SELECT * FROM indicador_situacao_aprendizagem where situacao_aprendizagem_id = :id", nativeQuery = true)
	Optional<IndicadorSituacaoAprendizagem> findBySituacao(Long id); 
	
}
