package ir.microservice.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MicroservicesConfigClientApplication {

	@Value("${message}")
	private String message;
	
	@RequestMapping("/message")
	public String message(){
		return message;
	}
	
	
	public static void main(String[] args) {
		SpringApplication.run(MicroservicesConfigClientApplication.class, args);
	}
	
}
