package com.aok;

import com.aok.com.aok.configuration.ServiceConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@Import(ServiceConfiguration.class)
@RestController
public class HelloWorldWebApp {

    @Autowired
    HelloWorldService helloWorldService;

    @RequestMapping("/")
    public String getMessage() {
        return helloWorldService.getMessage();
    }

    public static void main(String[] args) {
        SpringApplication.run(HelloWorldWebApp.class, args);
    }
}
