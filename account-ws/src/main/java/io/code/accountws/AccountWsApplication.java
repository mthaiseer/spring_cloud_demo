package io.code.accountws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class AccountWsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountWsApplication.class, args);
	}

}
