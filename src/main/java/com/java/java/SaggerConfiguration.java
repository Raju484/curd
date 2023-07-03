package com.java.java;

import com.java.java.entity.User;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class SaggerConfiguration {

    @Value("${curd.openapi.dev-url}")
    private String devUrl;

        @Bean
        OpenAPI getOpenApi(){

            Server devServer = new Server();
            devServer.setUrl(devUrl);
            devServer.setDescription("Used for dev ");


            Info info = new Info()
                    .title("Tutorial Management API")
                    .version("1.0")
                    .description("This API exposes endpoints to manage tutorials.").termsOfService("https://www.bezkoder.com/terms");
               return new OpenAPI().servers(List.of(devServer));
        }

}
