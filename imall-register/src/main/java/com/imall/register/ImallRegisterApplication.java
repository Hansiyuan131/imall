package com.imall.register;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@EnableEurekaServer //开启Eureka服务端功能
@SpringBootApplication
public class ImallRegisterApplication {

    public static void main(String[] args) {
        SpringApplication.run(ImallRegisterApplication.class, args);
    }

}
