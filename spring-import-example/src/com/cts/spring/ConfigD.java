package com.cts.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(value = {ConfigA.class,ConfigB.class,ConfigC.class})
public class ConfigD {

	@Bean
    public D d() {
        return new D();
    }
}
