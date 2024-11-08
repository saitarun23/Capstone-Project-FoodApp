package com;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.backend.entity.Login;
import com.backend.repository.LoginRepository;

import jakarta.annotation.PostConstruct;

@SpringBootApplication(scanBasePackages = "com.backend")
@EntityScan(basePackages = "com.backend.entity")
@EnableJpaRepositories(basePackages = "com.backend.repository")
@EnableDiscoveryClient
public class LoginAppMicroServiceApplication {
	
	@Autowired
	LoginRepository loginRepository;
	
	@PostConstruct
	public void init() {
		//System.out.println("method called..");
		Optional<Login> result = loginRepository.findById("admin@gmail.com");
		if(result.isPresent()) {
			System.err.println("Admin account already present");
		}else {
			Login ll = new Login();
			ll.setEmailid("admin@gmail.com");
			ll.setPassword("admin@123");
			ll.setTypeofuser("admin");
			loginRepository.save(ll);
			System.err.println("Admin account created..");
		}
	}

	public static void main(String[] args) {
		SpringApplication.run(LoginAppMicroServiceApplication.class, args);
		System.err.println("login micro service up on port number 8181");
	}

}
