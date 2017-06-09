package com.aok;

import org.springframework.stereotype.Component;

@Component
public class HelloWorldService {

    private String message;

    public HelloWorldService(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }

}
