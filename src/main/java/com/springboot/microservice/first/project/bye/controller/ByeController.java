package com.springboot.microservice.first.project.bye.controller;

import com.springboot.microservice.first.project.bye.service.ByeCounterService;
import com.springboot.microservice.first.project.bye.service.HelloCounterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bye")
public class ByeController {

    @Autowired
    private ByeCounterService byeCounterService;

    @Autowired
    private HelloCounterService helloCounterService;

    @GetMapping()
    public String sayBye() {
        byeCounterService.incrementCounter();
        System.out.println("Количество прощаний! " + byeCounterService.getCounter());
        return "Всего дорброго! Вы здоровались " + helloCounterService.getCounter() + " раз(а)!";
    }
}
