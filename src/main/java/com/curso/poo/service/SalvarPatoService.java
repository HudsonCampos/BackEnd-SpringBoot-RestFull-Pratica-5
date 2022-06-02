package com.curso.poo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.poo.configurations.DozerConverter;
import com.curso.poo.model.Pato;
import com.curso.poo.model.vo.PatoVO;
import com.curso.poo.repository.RepositoryPato;

@Service
public class SalvarPatoService {

	@Autowired
	RepositoryPato repositoryPato;
	
	public PatoVO salvar(PatoVO patovo) {		
		var entity = DozerConverter.converterObject(patovo, Pato.class);
		return DozerConverter.converterObject(repositoryPato.save(entity), PatoVO.class);				
	}
}
