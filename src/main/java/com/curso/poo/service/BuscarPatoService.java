package com.curso.poo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.curso.poo.configurations.DozerConverter;
import com.curso.poo.model.vo.PatoVO;
import com.curso.poo.repository.RepositoryPato;

@Service
public class BuscarPatoService {

	@Autowired
	RepositoryPato repositoryPato;

	public PatoVO buscarPatoId(Integer id) {
		var entity = repositoryPato.findById(id)
				.orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Id não Localizado!"));
		return DozerConverter.converterObject(entity, PatoVO.class);	
	}
}
