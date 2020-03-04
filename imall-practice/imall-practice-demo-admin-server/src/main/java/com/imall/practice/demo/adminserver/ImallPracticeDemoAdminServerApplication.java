package com.imall.practice.demo.adminserver;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAdminServer
@SpringBootApplication
public class ImallPracticeDemoAdminServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ImallPracticeDemoAdminServerApplication.class, args);
    }

}
