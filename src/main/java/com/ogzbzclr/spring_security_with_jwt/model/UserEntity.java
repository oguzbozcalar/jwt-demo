package com.ogzbzclr.spring_security_with_jwt.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserEntity {
    private Long id;
    private String email;
    @JsonIgnore
    private String  password;
    private String role;
    private String extraInfo;

}
