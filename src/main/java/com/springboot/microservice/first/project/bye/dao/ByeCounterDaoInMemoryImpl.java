package com.springboot.microservice.first.project.bye.dao;

import org.springframework.stereotype.Repository;

@Repository
public class ByeCounterDaoInMemoryImpl implements ByeCounterDao {

    private long counter;

    @Override
    public long getCounter() {
        return counter;
    }

    @Override
    public void incrementCounter() {
        this.counter++;
    }

}
