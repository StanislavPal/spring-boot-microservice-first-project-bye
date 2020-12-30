package com.springboot.microservice.first.project.bye;

import com.springboot.microservice.first.project.bye.counter.dto.CounterDto;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient( name="my-hello-service")
@RibbonClient(name="my-hello-service")
public interface HelloCounterServiceProxy {
    @GetMapping("/hello/count")
    public CounterDto getHelloCount();
}
