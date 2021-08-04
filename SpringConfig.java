package com.infy.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.infy.repository.InsuranceRepositoryImpl;
import com.infy.service.InsuranceServiceImpl;

@Configuration
public class SpringConfig {
	
	@Bean
	public InsuranceServiceImpl insuranceServiceImpl()
	{
		return new InsuranceServiceImpl();
	}
	
	@Bean
	public InsuranceRepositoryImpl insuranceRepositryImpl()
	{
		return new InsuranceRepositoryImpl();
	}
}