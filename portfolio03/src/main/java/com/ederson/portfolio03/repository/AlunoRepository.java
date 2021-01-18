package com.ederson.portfolio03.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ederson.portfolio03.entity.Aluno;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Long> {

	Aluno findByNome(String nome);
	
	@Query(value = "select a.* from aluno a where a.email like %?%", nativeQuery = true)
	List<Aluno> buscarPorEmail(String email);
	
}
