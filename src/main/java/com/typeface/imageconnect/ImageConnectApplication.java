package com.typeface.imageconnect;

import com.typeface.imageconnect.service.UserService;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ImageConnectApplication {

	private final UserService userService;

	public ImageConnectApplication(UserService userService) {
		this.userService = userService;
	}

	public static void main(String[] args) {
		SpringApplication.run(ImageConnectApplication.class, args);
	}

	@PostConstruct
	public void createDummyUsers() {
		userService.createDummyUsers();
	}

	@PreDestroy
	public void deleteAllUsers() {
		userService.deleteAllUsers();
	}

}
