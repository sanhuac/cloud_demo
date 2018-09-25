package com.minyin.byc.driver_provider;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableEurekaClient
@MapperScan(basePackages = "com.minyin.byc.driver_provider.mapper")
public class DriverProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(DriverProviderApplication.class, args);
	}


}
