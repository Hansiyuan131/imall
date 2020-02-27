package com.imall.common.handler;

import com.imall.common.entity.ImallResponse;
import com.imall.common.exception.ImallAuthException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.security.auth.message.AuthException;

@Slf4j
public class BaseExceptionHandler {
    @ExceptionHandler(value = Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ImallResponse handleException(Exception e) {
        log.error("系统内部异常，异常信息", e);
        return new ImallResponse().message("系统内部异常");
    }

    @ExceptionHandler(value = ImallAuthException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ImallResponse handleFebsAuthException(ImallAuthException e) {
        log.error("系统错误", e);
        return new ImallResponse().message(e.getMessage());
    }

    @ExceptionHandler(value = AccessDeniedException.class)
    @ResponseStatus(HttpStatus.FORBIDDEN)
    public ImallResponse handleAccessDeniedException(){
        return new ImallResponse().message("没有权限访问该资源");
    }
}
