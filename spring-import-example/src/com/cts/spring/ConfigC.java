package com.cts.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(ConfigB.class)
public class ConfigC {

	@Bean
	public C c()
	{
		return new C();
	}
}
