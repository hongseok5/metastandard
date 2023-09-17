package com.hongseok.metastandard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class MetastandardApplication {

    public static void main(String[] args) {

        SpringApplication.run(MetastandardApplication.class, args);
    }

}
