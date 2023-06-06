package com.senac.api.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.senac.api.entity.SituacaoObjetoAprendizagem;

@Repository
public interface SituacaoObjetoAprendizagemRepository extends JpaRepository<SituacaoObjetoAprendizagem, Long>{
	
	@Query(value = "SELECT * FROM situacao_objeto_aprendizagem where objeto_aprendizagem_id = :id", nativeQuery = true)
	Optional<SituacaoObjetoAprendizagem> findByObjeto(Long id); 
	
	@Query(value = "SELECT * FROM situacao_objeto_aprendizagem where situacao_aprendizagem_id = :id", nativeQuery = true)
	Optional<SituacaoObjetoAprendizagem> findBySituacao(Long id); 

}
