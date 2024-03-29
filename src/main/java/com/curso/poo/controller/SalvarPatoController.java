package com.curso.poo.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.curso.poo.model.vo.PatoVO;
import com.curso.poo.service.SalvarPatoService;

@RestController
@RequestMapping(path = "/api/pato/v1")
public class SalvarPatoController {
	
	@Autowired
	SalvarPatoService salvarPatoService;
	
	@PostMapping(value = "/criar")
	@ResponseStatus(HttpStatus.CREATED)
	public PatoVO salvar(@RequestBody @Valid PatoVO patovo) {
		return salvarPatoService.salvar(patovo);
	}
	
	
}
