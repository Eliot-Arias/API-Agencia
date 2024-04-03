package com.main.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.main.entidades.LugarTuristico;

@Repository
public interface LugarTuristicoRepository extends JpaRepository<LugarTuristico, Long> {
	
	public List<LugarTuristico> findByDepartamentoId(Long id);

}
