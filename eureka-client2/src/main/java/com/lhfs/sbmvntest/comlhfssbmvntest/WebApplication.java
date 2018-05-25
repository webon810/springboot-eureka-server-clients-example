package com.lhfs.sbmvntest.comlhfssbmvntest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@EnableDiscoveryClient
@SpringBootApplication
@ComponentScan  //scan root package
public class WebApplication {

	public static void main(String[] args) throws Exception {
	SpringApplication.run(WebApplication.class, args);
	}
}
