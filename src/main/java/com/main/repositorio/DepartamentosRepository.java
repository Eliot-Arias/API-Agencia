package com.main.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.main.entidades.Departamentos;

@Repository
public interface DepartamentosRepository extends JpaRepository<Departamentos, Long> {
	
}
