package com.springboot.microservice.first.project.bye.controller;

import com.springboot.microservice.first.project.bye.HelloCounterServiceProxy;
import com.springboot.microservice.first.project.bye.counter.CounterType;
import com.springboot.microservice.first.project.bye.counter.dto.CounterDto;
import com.springboot.microservice.first.project.bye.service.HelloCounterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @Autowired
    private HelloCounterService helloCounterService;

    @Autowired
    private HelloCounterServiceProxy helloCounterServiceProxy;

    @RequestMapping()
    public ResponseEntity<CounterDto> getHelloCount() {

        ResponseEntity<CounterDto> response = new RestTemplate().getForEntity(
                "http://localhost:8000/hello/count", CounterDto.class);

        CounterDto counterDto = response.getBody(); //new CounterDto(CounterType.HELLO, counter);

        if ( counterDto != null ) {
            helloCounterService.setCounter( counterDto.getCount() );
        }
        return new ResponseEntity<>(counterDto, HttpStatus.OK);
    }

    @RequestMapping("feign")
    public ResponseEntity<CounterDto> getHelloCountFeign() {

        CounterDto counterDto = helloCounterServiceProxy.getHelloCount(); //new CounterDto(CounterType.HELLO, counter);

        if ( counterDto != null ) {
            helloCounterService.setCounter( counterDto.getCount() );
        }
        return new ResponseEntity<>(counterDto, HttpStatus.OK);
    }


}
