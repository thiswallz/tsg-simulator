package com.tsg.simulator.seed;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class SeedScheduler {
    @Autowired
    private SimpMessagingTemplate template;

    @Scheduled(fixedRate = 5000) // Schedule the task to run every 5 seconds
    public void runTask() {
        // This will send messages to the client if required
        System.out.println("Task executed at " + new Date());
        this.template.convertAndSend("/topic/greetings", "Task executed at " + new Date());
    }
}
