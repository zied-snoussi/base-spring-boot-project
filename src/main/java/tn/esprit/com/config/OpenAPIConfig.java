package tn.esprit.com.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class OpenAPIConfig {

    @Value("${server.port:8082}")
    private String serverPort;

    @Bean
    public OpenAPI springShopOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("E-COMMERCE REST API")
                        .description("Comprehensive REST API for E-COMMERCE Management System - " +
                                "Manage clients, orders, articles, promotions, loyalty cards, and addresses")
                        .version("1.0.0")
                        .contact(new Contact()
                                .name("Zied SNOUSSI")
                                .email("zied.snoussi@esprit.tn")
                                .url("https://github.com/zied-snoussi"))
                        .license(new License()
                                .name("Apache 2.0")
                                .url("https://www.apache.org/licenses/LICENSE-2.0.html")))
                .servers(List.of(
                        new Server()
                                .url("http://localhost:" + serverPort + "/api")
                                .description("Development Server"),
                        new Server()
                                .url("https://api.E-COMMERCE.com")
                                .description("Production Server")
                ));
    }
}
