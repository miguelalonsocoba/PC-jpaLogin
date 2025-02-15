package com.pc.login.jpa_login.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/public")
@RequiredArgsConstructor
public class PublicController {

    @GetMapping(value = "/home")
    public String home() {
        return "Public Home";
    }
}
