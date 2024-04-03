package com.main.servicios.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.entidades.Departamentos;
import com.main.entidades.LugarTuristico;
import com.main.repositorio.DepartamentosRepository;
import com.main.repositorio.LugarTuristicoRepository;
import com.main.servicios.LugaresTServices;

@Service
public class LugarTuristicoImpl implements LugaresTServices{

	@Autowired 
	private LugarTuristicoRepository lugarTuristicoRepository;
	
	@Autowired 
	private DepartamentosRepository departamentosRepository;
	
	private Departamentos departamento;
	
	@Override
	public List<LugarTuristico> listarLugares(Long id) {
		List<LugarTuristico> lista = lugarTuristicoRepository.findByDepartamentoId(id);
		
		return lista;
		
	}

}
