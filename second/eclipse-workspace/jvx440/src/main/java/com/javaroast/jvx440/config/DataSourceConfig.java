package com.javaroast.jvx440.config;

import javax.sql.DataSource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.zaxxer.hikari.HikariDataSource;

@Configuration
public class DataSourceConfig {
	@Bean(destroyMethod = "close")
	@ConfigurationProperties("spring.datasource.hikari")
	public DataSource dataSource() {
		return DataSourceBuilder.create()
								.type(HikariDataSource.class)
								.build();
	}
	
}
