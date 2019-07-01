package com.mchne.core.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"com.mchne.core.rest", "com.mchne.core.services", "com.mchne.core.common"})
@EntityScan("com.mchne.core.data.persistence.entity")
@EnableJpaRepositories("com.mchne.core.data.persistence.repository")
public class CoreWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(CoreWebApplication.class, args);
    }

}
