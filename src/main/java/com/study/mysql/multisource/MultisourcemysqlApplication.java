package com.study.mysql.multisource;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@MapperScan(basePackages = "com.study.mysql.multisource.mapper")
public class MultisourcemysqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(MultisourcemysqlApplication.class, args);
	}

}
