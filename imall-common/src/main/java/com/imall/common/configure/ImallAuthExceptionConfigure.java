package com.imall.common.configure;

import com.imall.common.handler.ImallAccessDeniedHandler;
import com.imall.common.handler.ImallAuthExceptionEntryPoint;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.security.web.access.AccessDeniedHandler;

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
