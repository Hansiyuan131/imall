package com.imall.auth;

import com.imall.common.annotation.EnableImallAuthExceptionHandler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
@EnableImallAuthExceptionHandler
public class ImallAuthApplication {

    public static void main(String[] args) {
        SpringApplication.run(ImallAuthApplication.class, args);
    }

}
