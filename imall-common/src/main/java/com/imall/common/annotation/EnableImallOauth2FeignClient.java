package com.imall.common.annotation;

import com.imall.common.configure.ImallOAuth2FeignConfigure;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(ImallOAuth2FeignConfigure.class)
public @interface EnableImallOauth2FeignClient {
}
