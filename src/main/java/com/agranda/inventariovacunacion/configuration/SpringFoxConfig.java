package com.agranda.inventariovacunacion.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

@Configuration
@EnableSwagger2
public class SpringFoxConfig {

    @Bean
    public Docket empleadosApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.agranda.inventariovacunacion.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfo(
                "Inventario de Vacunación",
                "Registro del inventario del estado de vacunación de empleados con Spring Boot.",
                "API V1",
                "",
                new Contact("Abel Granda", "https://www.linkedin.com/in/abel-granda-zu%C3%B1iga/", "abelgranda@hotmail.com"),
                "", "", Collections.emptyList());
    }
}
