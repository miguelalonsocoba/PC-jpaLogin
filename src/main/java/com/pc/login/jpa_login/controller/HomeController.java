package com.pc.login.jpa_login.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/v1")
@RequiredArgsConstructor
public class HomeController {

    @GetMapping(value = "/home")
    public String home() {
        return "Private Home";
    }

    @GetMapping(value = "/admin")
    @PreAuthorize("hasAuthority('ADMIN')")
    public String admin() {
        return "Admin";
    }
}
