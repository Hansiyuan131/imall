package com.imall.server.test;

import com.imall.common.annotation.EnableImallAuthExceptionHandler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;

@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
@EnableImallAuthExceptionHandler
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class ImallServerTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(ImallServerTestApplication.class, args);
    }

}
