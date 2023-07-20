package ua.avd1ev.poj.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class OpenAPIConfig {
    @Value("${poj.openapi.dev-url}")
    private String devUrl;

    @Bean
    public OpenAPI myOpenAPI() {
        Server devServer = new Server();
        devServer.setUrl(devUrl);
        devServer.setDescription("Server URL in Development environment");

        Contact contact = new Contact();
        contact.setEmail("avdeev10v@gmail.com");
        contact.setName("avd1ev");
        contact.setUrl("https://www.linkedin.com/in/victor-avdeev-20a2b1246/");


        Info info = new Info().title("Point Of Job API").version("1.0").contact(contact).description("PoJ APIs");

        return new OpenAPI().info(info).servers(List.of(devServer));
    }
}
