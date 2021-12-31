package io.techerd.userservice;

import io.techerd.userservice.models.AppUser;
import io.techerd.userservice.models.Role;
import io.techerd.userservice.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.ArrayList;

@SpringBootApplication(scanBasePackages = {"controllers", "models", "repository", "services", "filter", "security"})
@ComponentScan({"io.techerd.userservice"})
public class UserserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserserviceApplication.class, args);
	}

//	@Bean
//	CommandLineRunner run(UserService userService){
//		return args -> {
//			userService.saveRole(new Role(null, "ROLE_USER" ));
//			userService.saveRole(new Role(null, "ROLE_MANAGER" ));
//			userService.saveRole(new Role(null, "ROLE_ADMIN" ));
//			userService.saveRole(new Role(null, "ROLE_SUPER_USER" ));
//
//			userService.saveUser(new AppUser(null, "John Travolta", "john", "1234", new ArrayList<>()));
//			userService.saveUser(new AppUser(null, "Will Smith", "will", "1234", new ArrayList<>()));
//			userService.saveUser(new AppUser(null, "Jim Carry", "jim", "1234", new ArrayList<>()));
//			userService.saveUser(new AppUser(null, "Muhsin Raji", "muhsin", "1234", new ArrayList<>()));
//
//			userService.addRoleToUser("john", "ROLE_USER");
//			userService.addRoleToUser("muhsin", "ROLE_SUPER_USER");
//			userService.addRoleToUser("jim", "ROLE_ADMIN");
//			userService.addRoleToUser("jim", "ROLE_USER");
//		};
//	}

	@Bean
	PasswordEncoder passwordEncoder(){
		return new BCryptPasswordEncoder();
	}
}
