package com.meshal.firstspringbootapp;

import org.springframework.web.bind.annotation.*;

@RestController
public class AppController {

    @GetMapping("/greet")
    public String greet(@RequestParam(required = false, defaultValue = "Nora") String name) {
        return ("Hello, " + name + "!");
    }

    @PostMapping("/farewell")
    public String farewell(@RequestBody Person person) {
        return "Goodbye, " + person.name + "!";
    }

}

