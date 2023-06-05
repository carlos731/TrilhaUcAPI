package com.senac.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.senac.api.entity.SituacaoObjetoAprendizagem;

@Repository
public interface SituacaoObjetoAprendizagemRepository extends JpaRepository<SituacaoObjetoAprendizagem, Long>{

}
