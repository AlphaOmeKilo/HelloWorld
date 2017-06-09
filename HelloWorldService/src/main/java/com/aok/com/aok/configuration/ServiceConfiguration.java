package com.aok.com.aok.configuration;

import com.aok.HelloWorldService;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(MessageProperties.class)
public class ServiceConfiguration {

    @Bean
    public HelloWorldService helloWorldService(MessageProperties properties) {
        return new HelloWorldService(properties.getMessage());
    }

}
