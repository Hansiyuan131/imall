package com.imall.common.annotation;

import com.imall.common.configure.ImallAuthExceptionConfigure;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(ImallAuthExceptionConfigure.class)
public @interface EnableImallAuthExceptionHandler {
}
