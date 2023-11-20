package com.tungphongdo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = {"/health-check"})
public class HealthCheckController {
    @GetMapping
    public ResponseEntity<String> hello(){
        return ResponseEntity.ok("Hello world 2");
    }
}
