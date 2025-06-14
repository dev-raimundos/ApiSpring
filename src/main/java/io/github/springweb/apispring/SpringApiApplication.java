package io.github.springweb.apispring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController // Annotation para tornar a classe gerenciável pelo Spring Boot.
public class SpringApiApplication {

    // Definindo uma rota simples
    @GetMapping("/hello-world")
    public String helloWorld() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        // Bootstrap da aplicação Spring dentro do method Main
        SpringApplication.run(SpringApiApplication.class, args);
    }

}
