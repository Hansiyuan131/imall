package com.imall.common.entity;

import java.io.Serializable;
import lombok.Data;

@Data
public class ImallAuthUser  implements Serializable {
    private static final long serialVersionUID = -1748289340320186418L;

    private String username;

    private String password;

    private boolean accountNonExpired = true;

    private boolean accountNonLocked= true;

    private boolean credentialsNonExpired= true;

    private boolean enabled= true;
}
