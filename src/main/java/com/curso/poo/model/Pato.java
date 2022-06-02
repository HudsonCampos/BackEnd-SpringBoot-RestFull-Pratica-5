package com.curso.poo.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode
@Entity
@Table(name = "t_pato")
public class Pato implements Serializable {


	private static final long serialVersionUID = 1L;
	
	
	@Id
	@SequenceGenerator(name = "seq_pato", sequenceName = "seq_pato", allocationSize = 1)
	@GeneratedValue(generator = "seq_pato", strategy = GenerationType.SEQUENCE)
	private Integer id_pato;
	
	@Column(name = "cor", length = 255, nullable = false)
	private String cor;
	
	@Column(name = "tipo", length = 255, nullable = false)
	private String tipo;
}
