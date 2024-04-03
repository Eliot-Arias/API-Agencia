package com.main.servicios.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.entidades.Departamentos;
import com.main.repositorio.DepartamentosRepository;
import com.main.servicios.DepartamentoService;

@Service
public class DepartamentoImpl implements DepartamentoService{
	
	@Autowired
	private DepartamentosRepository departamentosRepository;
	
	@Override
	public List<Departamentos> ObtenerDepartamenos() {
		List<Departamentos> listaDepartamentos = departamentosRepository.findAll();
		return listaDepartamentos;		
	}
	
	

}
