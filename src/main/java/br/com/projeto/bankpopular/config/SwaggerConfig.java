package br.com.projeto.bankpopular.config;

import io.swagger.v3.oas.annotations.security.SecurityScheme;
import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {
    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                        .info(new Info()
                                .title("BanK Popular API")
                                .description("API Rest do Bank Popular")
                                .contact(new Contact()
                                                .name("Time Backend")
                                                .email("example@bankpop.com"))
                        .license(new License()
                                        .name("Apache 2.0")
                                        .url("http://backpopular/api/licenca")

                                )
                        );


    }



}
