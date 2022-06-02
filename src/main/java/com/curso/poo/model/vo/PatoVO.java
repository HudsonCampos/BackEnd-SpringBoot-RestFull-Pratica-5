package com.curso.poo.model.vo;

import java.io.Serializable;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.hateoas.RepresentationModel;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode(callSuper=false)
public class PatoVO extends RepresentationModel<PatoVO> implements Serializable {


	private static final long serialVersionUID = 1L;
	
	
	private Integer id_pato;
	
	@NotEmpty(message = "{cor.vazio}")
	private String cor;
	
	private String tipo;
}
