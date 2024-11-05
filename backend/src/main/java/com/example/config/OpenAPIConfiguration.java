
package com.example.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class OpenAPIConfiguration {

    @Bean
    public OpenAPI defineOpenApi() {
        Server server = new Server();
        server.setDescription("Development");

        Contact myContact = new Contact();
        myContact.setName("John Doe");
        myContact.setEmail("your-mail@mockmail.com");

        Info information = new Info()
                .title("Java Spring-boot + React Archetype API")
                .version("1.0")
                .description("This API exposes the final points you want to expose in your own project!!")
                .contact(myContact);
        return new OpenAPI().info(information).servers(List.of(server));
    }
}

