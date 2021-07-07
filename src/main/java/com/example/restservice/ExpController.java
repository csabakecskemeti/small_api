package com.example.restservice;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExpController {

    @RequestMapping("/hearthbeat")
    public String getHearthBeat() {
        return "beap";
    }
}
