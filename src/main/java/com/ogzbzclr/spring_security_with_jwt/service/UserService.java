package com.ogzbzclr.spring_security_with_jwt.service;

import com.ogzbzclr.spring_security_with_jwt.model.UserEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    private static final String EXISTING_EMAIL = "test@test.com";

    public Optional<UserEntity> findByEmail(String email){
        if(!EXISTING_EMAIL.equalsIgnoreCase(email)) return Optional.empty();
        var user = new UserEntity();
        user.setId(1L);
        user.setEmail(EXISTING_EMAIL);
        user.setPassword("$2a$12$Cibb.X1hVN5zRPjZodaoiuSsxEneBeSl/EYuXKwLZUDwoSm4M3TnO"); // test
        user.setRole("ROLE_ADMIN");
        user.setExtraInfo("My nice admin");
        return Optional.of(user);

    }
}
