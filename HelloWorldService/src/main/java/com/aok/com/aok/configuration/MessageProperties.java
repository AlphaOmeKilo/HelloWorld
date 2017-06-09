package com.aok.com.aok.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("service")
public class MessageProperties {

    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }
}
