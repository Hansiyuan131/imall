package com.imall.server.system.annotation;

import com.imall.server.system.configure.ImallAuthExceptionConfigure;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(ImallAuthExceptionConfigure.class)
public @interface EnableImallAuthExceptionHandler {
}
