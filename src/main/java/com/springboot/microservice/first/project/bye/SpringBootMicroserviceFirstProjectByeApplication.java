package com.springboot.microservice.first.project.bye;

import com.springboot.microservice.first.project.bye.service.HelloCounterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.annotation.KafkaListener;

@EnableKafka
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class SpringBootMicroserviceFirstProjectByeApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootMicroserviceFirstProjectByeApplication.class, args);
    }

}
