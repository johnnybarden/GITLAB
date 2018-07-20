package com.epam.lab.SpringBootDemo1.spring;

import com.epam.lab.SpringBootDemo1.spring.swagger.SwaggerConfig;
import com.epam.lab.SpringBootDemo1.spring.swagger.SwaggerWebMvcConfigurerAdapter;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource({
        "classpath:application.properties",
})
@ComponentScan(value = "com.epam.lab.SpringBootDemo1.spring")
@Import({
        SwaggerConfig.class,
        SwaggerWebMvcConfigurerAdapter.class
})
public class SpringConfig {
}
