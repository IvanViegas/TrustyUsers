package com.trustyUsersApi.demo;

import com.trustyUsersApi.demo.repository.UsuarioRepository;
import com.trustyUsersApi.demo.services.UsuarioService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TrustyUsersApplication {

	public static void main(String[] args) {
		SpringApplication.run(TrustyUsersApplication.class, args);
	}
}
