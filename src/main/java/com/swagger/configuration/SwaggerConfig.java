package com.swagger.configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeIn;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.http.HttpHeaders;

@OpenAPIDefinition(info = @Info(title = "API CLUBES", description = "football team names", termsOfService = "www.ejemplo", version = "1.0.0", contact = @Contact(name = "Santiago", url = "www.ejemplo", email = "ejemplo@gmail.com"), license = @License( name = "Standard Software", url = "www.otroejemplo.com", identifier = "112121")), servers = {

        @Server(
                description = "DEV SERVER",
                url = "http://localhost:8080"
        ),
        @Server(
                description = "PROD SERVER",
                url = "http://dominio:8080"
        )
        },
        security = @SecurityRequirement(
                name = "Security Token"
        )
)
@SecurityScheme(

        name = "Security Token",
        description = "Access token for my API",
        type = SecuritySchemeType.HTTP,
        paramName = HttpHeaders.AUTHORIZATION,
        in = SecuritySchemeIn.HEADER,
        scheme = "bearer",
        bearerFormat = "JWT"
)
public class SwaggerConfig {
}
