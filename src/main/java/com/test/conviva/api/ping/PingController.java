package com.test.conviva.api.ping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PingController {

    @RequestMapping("/ping")
    public String sayHelloWorld() {
        return "Hello World!!!";
    }
}

