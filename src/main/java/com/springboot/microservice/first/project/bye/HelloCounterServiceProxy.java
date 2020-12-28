package com.springboot.microservice.first.project.bye;

import com.springboot.microservice.first.project.bye.counter.dto.CounterDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "forex-service", url= "localhost:8000")
public interface HelloCounterServiceProxy {
    @GetMapping("/hello/count")
    public CounterDto getHelloCount();
}
