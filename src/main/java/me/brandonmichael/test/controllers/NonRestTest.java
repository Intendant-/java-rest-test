package me.brandonmichael.test.controllers;

import me.brandonmichael.test.Quote;
import me.brandonmichael.test.Test;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;

@Controller
public class NonRestTest {


    @RequestMapping(value = "/quote")
    public int test() {


        RestTemplate restTemplate = new RestTemplate();
        Quote quote = restTemplate.getForObject("http://gturnquist-quoters.cfapps.io/api/random", Quote.class);
        return quote.getId();
    }

}
