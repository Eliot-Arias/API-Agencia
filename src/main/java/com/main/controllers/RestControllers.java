package com.main.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.main.entidades.Departamentos;
import com.main.entidades.LugarTuristico;
import com.main.servicios.DepartamentoService;
import com.main.servicios.LugaresTServices;

@RestController
public class RestControllers {

	@Autowired DepartamentoService departamentoService;
	
	@Autowired LugaresTServices lugaresTServices;
	
	
	@GetMapping("/departamentos")
	public List<Departamentos> listarDepartamentos(){
		return departamentoService.ObtenerDepartamenos();
	}
	
	@GetMapping("/turismo/{id}")
	public List<LugarTuristico> listarLugares(@PathVariable Long id){
		return lugaresTServices.listarLugares(id);
	}
	
	
}
