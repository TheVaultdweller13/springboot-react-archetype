package com.example.configurations;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenAPIConfiguration {

    @Bean
    public OpenAPI defineOpenApi() {
        var contact = new Contact();
        contact.setName("John Doe");
        contact.setEmail("your-mail@mockmail.com");

        var title = "Java Spring-boot + React Archetype API";
        var version = "1.0.0";
        var description = "This API exposes the final points you want to expose in your own project!!";

        var info = new Info()
                .title(title)
                .description(description)
                .version(version)
                .contact(contact);

        return new OpenAPI().info(info);
    }
}

