package com.imall.auth.properties;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import lombok.Data;

@Data
@SpringBootConfiguration
@PropertySource(value = {"classpath:imall-auth.properties"})
@ConfigurationProperties(prefix = "imall.auth")
public class ImallAuthProperties {

    private ImallClientsProperties[] clients = {};
    private int accessTokenValiditySeconds = 60 * 60 * 24;
    private int refreshTokenValiditySeconds = 60 * 60 * 24 * 7;
}
