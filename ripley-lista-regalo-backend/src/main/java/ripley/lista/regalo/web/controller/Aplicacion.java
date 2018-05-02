package ripley.lista.regalo.web.controller;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Configuration;

@Configuration
@SpringBootApplication
public class Aplicacion extends SpringBootServletInitializer {
		
	
	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Aplicacion.class);
    }
 
    public static void main(String[] args) {
        SpringApplication.run(Aplicacion.class, args);
    }
}
