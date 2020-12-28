package com.springboot.microservice.first.project.bye;

import com.springboot.microservice.first.project.bye.service.HelloCounterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListenerHolder {

    @Autowired
    HelloCounterService helloCounterService;

    @KafkaListener(topics = "hello")
    public void msgListener(String counter) {
        helloCounterService.setCounter(Long.parseLong(counter));
        System.out.println("======" + counter);
    }
}