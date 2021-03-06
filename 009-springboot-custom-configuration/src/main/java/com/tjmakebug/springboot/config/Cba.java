package com.tjmakebug.springboot.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "cba")
public class Cba {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWebsit() {
        return websit;
    }

    public void setWebsit(String websit) {
        this.websit = websit;
    }

    private String name;
    private String websit;
}
