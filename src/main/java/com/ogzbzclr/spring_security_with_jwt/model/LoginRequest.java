package com.ogzbzclr.spring_security_with_jwt.model;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class LoginRequest {

    private String email;

    private String password;
}
