package com.todoapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoAppController {
    @GetMapping("/")
    public String hello() {
        return "To-do Application !";
    }
}
