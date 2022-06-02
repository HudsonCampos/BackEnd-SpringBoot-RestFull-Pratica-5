package com.curso.poo.controller;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.curso.poo.model.vo.PatoVO;
import com.curso.poo.service.BuscarPatoService;

@RestController
@RequestMapping(path = "/api/pato/v1")
public class BuscarPatoController {
	
	@Autowired
	BuscarPatoService buscarPatoService;
	
	@GetMapping(value = "/buscarPatoId/{id}")
	@ResponseStatus(HttpStatus.OK)
	public PatoVO buscarPatoId(@PathVariable("id") Integer id) {
		var patovo = buscarPatoService.buscarPatoId(id);
		patovo.add(linkTo(methodOn(BuscarPatoController.class).buscarPatoId(id)).withSelfRel());
		return patovo;
	}
	
}
