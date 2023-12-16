package com.tsg.simulator.seed;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import java.util.Date;

@Controller
public class SeedWSController {

    @MessageMapping("/hello")
    @SendTo("/topic/greetings")
    public String greeting(Seed seed) throws Exception {
        Thread.sleep(1000); // simulated delay
        return "Hello, !";
    }

}
