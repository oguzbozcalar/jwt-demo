package com.ogzbzclr.spring_security_with_jwt.controller;

import com.ogzbzclr.spring_security_with_jwt.security.UserPrincipal;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class HelloController {

    @GetMapping
    public String greeting(){
        return "Hello world";
    }

    @GetMapping("/secured")
    public String secured(@AuthenticationPrincipal UserPrincipal principal) {
        return "If you see this, then you're logged in as user " + principal.getEmail() + " User ID: " + principal.getUserId();
    }

}
