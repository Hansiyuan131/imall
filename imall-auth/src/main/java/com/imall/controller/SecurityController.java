package com.imall.controller;

import com.imall.entity.ImallAuthUser;
import com.imall.entity.ImallResponse;
import com.imall.exception.ImallAuthException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.provider.token.ConsumerTokenServices;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.security.Principal;

@RestController
public class SecurityController {

    @Autowired
    private ConsumerTokenServices consumerTokenServices;

    @GetMapping("oauth/test")
    public String testOauth() {
        return "oauth";
    }

    @GetMapping("user")
    public Principal currentUser(Principal principal) {
        return principal;
    }

    @DeleteMapping("signout")
    public ImallResponse signout(HttpServletRequest request) throws ImallAuthException {
        String authorization = request.getHeader("Authorization");
        String token = StringUtils.replace(authorization, "bearer ", "");
        ImallResponse imallResponse = new ImallResponse();
        if (!consumerTokenServices.revokeToken(token)) {
            throw new ImallAuthException("退出登录失败");
        }
        return imallResponse.message("退出登录成功");
    }
}

