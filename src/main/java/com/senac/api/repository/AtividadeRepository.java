package com.senac.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.senac.api.entity.Atividade;

@Repository
public interface AtividadeRepository extends JpaRepository<Atividade, Long>{

}
