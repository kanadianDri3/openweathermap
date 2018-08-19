package org.lemaire;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@ComponentScan(basePackages = "org.lemaire.weather")
public class MainApplication {

    public static void main(final String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }
}
