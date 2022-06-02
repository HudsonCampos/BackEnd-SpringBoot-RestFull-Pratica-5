package com.curso.poo.erros;

import java.util.Arrays;
import java.util.List;

import lombok.Data;

@Data
public class ApiError {

	private List<String> erros;
	
	public ApiError(String msg) {
		this.erros = Arrays.asList(msg);
	}
	
	public ApiError(List<String> msgs) {
		this.erros = msgs;
	}
}
