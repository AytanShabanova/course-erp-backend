package com.example.course_erp_backend.configs;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import jakarta.validation.groups.ConvertGroup;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {
    @Bean
    public OpenAPI myOpenApi(){
        Contact contact=new Contact();
        contact.setEmail("shabanovaaytan@gmail.com");


        Info info = new Info();
        info.setContact(contact);
        info.setTitle("Course Erp Backend");
        info.setVersion("1.0.0");

        return new OpenAPI().info(info);
    }
}
