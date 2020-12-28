package com.springboot.microservice.first.project.bye.dao;

import org.springframework.stereotype.Repository;

@Repository
public class HelloCounterDaoInMemoryImpl {

    private long counter;

    public long getCounter() {
        return counter;
    }

    public void incrementCounter() {
        this.counter++;
    }

    public void setCounter(long counter) {
        this.counter = counter;
    }

}
