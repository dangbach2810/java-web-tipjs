package com.bit.controller;

import jakarta.annotation.security.RolesAllowed;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("v1/admin")
public class AdminController {
    @RolesAllowed({"admin"})
    @GetMapping("vip")
    public String zoneVip() {
        return "VIPPPP";
    }
    @RolesAllowed({"user", "admin"})
    @GetMapping("nor")
    public String zoneNormal() {
        return "NORMAL";
    }

    @GetMapping("info")
    public Authentication getInfo() {
        return SecurityContextHolder.getContext().getAuthentication();
    }
}
