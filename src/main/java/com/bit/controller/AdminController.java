package com.bit.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("v1/admin")
public class AdminController {
    @GetMapping("vip")
    public String zoneVip() {
        return "VIPPPP";
    }
    @GetMapping("nor")
    public String zoneNormal() {
        return "NORMAL";
    }
    
}
