package com.imall.server.system.configure;

import com.imall.server.system.handler.ImallAccessDeniedHandler;
import com.imall.server.system.handler.ImallAuthExceptionEntryPoint;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;

public class ImallAuthExceptionConfigure {
    @Bean
    @ConditionalOnMissingBean(name = "accessDeniedHandler")
    public ImallAccessDeniedHandler accessDeniedHandler() {
        return new ImallAccessDeniedHandler();
    }

    @Bean
    @ConditionalOnMissingBean(name = "authenticationEntryPoint")
    public ImallAuthExceptionEntryPoint authenticationEntryPoint() {
        return new ImallAuthExceptionEntryPoint();
    }
}
