package com.curso.poo.configurations;

import java.util.ArrayList;
import java.util.List;

import com.github.dozermapper.core.DozerBeanMapperBuilder;
import com.github.dozermapper.core.Mapper;

public class DozerConverter{

	private static Mapper mapper = DozerBeanMapperBuilder.buildDefault();
	
	public static <O, D> D converterObject(O origin, Class<D> destination) {
		return mapper.map(origin, destination);
	}
	
	public static <O, D> List<D> converterObjectList(List<O> origins, Class<D> destination){
		List<D> returnListObject = new ArrayList<D>();
		for(Object o : origins) {
			returnListObject.add(mapper.map(o, destination));
		}
		return returnListObject;
	}
	
	
}
