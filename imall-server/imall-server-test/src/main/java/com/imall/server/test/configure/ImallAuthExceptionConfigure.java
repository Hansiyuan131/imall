package com.imall.server.test.configure;

import com.imall.server.test.handler.ImallAccessDeniedHandler;
import com.imall.server.test.handler.ImallAuthExceptionEntryPoint;
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
