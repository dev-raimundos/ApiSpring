package io.github.springweb.apispring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringApiApplication {

    @GetMapping("/hello-world")
    public String helloWorld(){
        return "Hello World!";
    }

	public static void main(String[] args) {
		SpringApplication.run(SpringApiApplication.class, args);
	}

}
