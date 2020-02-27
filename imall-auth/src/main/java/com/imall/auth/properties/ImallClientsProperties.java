package com.imall.auth.properties;
import lombok.Data;

@Data
public class ImallClientsProperties {
    private String client;//client_id
    private String secret;//client_secret
    private String grantType = "password,authorization_code,refresh_token";//当前令牌支持的认证类型
    private String scope = "all";//认证范围
}
