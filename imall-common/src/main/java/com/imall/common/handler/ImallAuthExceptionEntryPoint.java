package com.imall.common.handler;

import com.alibaba.fastjson.JSONObject;
import com.imall.common.entity.ImallResponse;
import com.imall.common.utils.ImallUtil;
import org.springframework.http.MediaType;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ImallAuthExceptionEntryPoint implements AuthenticationEntryPoint {
    @Override
    public void commence(HttpServletRequest request, HttpServletResponse response,
                         AuthenticationException authException) throws IOException {
        ImallResponse febsResponse = new ImallResponse();

        response.setContentType(MediaType.APPLICATION_JSON_UTF8_VALUE);
        response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
        response.getOutputStream().write(JSONObject.toJSONString(febsResponse.message("token无效")).getBytes());
    }
}