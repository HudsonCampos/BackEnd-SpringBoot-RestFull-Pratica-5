package com.curso.poo.internacionalizacao;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

@Configuration
public class ValidationConfigMessage {
	
	@Bean
	public LocalValidatorFactoryBean localValidatorFactoryBean(ConfigMessage configMessage) {
		LocalValidatorFactoryBean bean = new LocalValidatorFactoryBean();
		bean.setValidationMessageSource(configMessage.messageSource());
		
		return bean;
	}
}
