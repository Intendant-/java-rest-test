package me.brandonmichael.test.controllers;


import me.brandonmichael.test.models.Test;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping(value = "/test")
public class TestController {


    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @CrossOrigin(origins = "http://localhost:3000")
    @RequestMapping("")
    public Test test(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Test(counter.incrementAndGet(), String.format(template, name));
    }

}
