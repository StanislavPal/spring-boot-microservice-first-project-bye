package com.springboot.microservice.first.project.bye.dao;

import org.springframework.stereotype.Repository;

@Repository
public class ByeCounterDaoInMemoryImpl implements CounterDao {

    private long counter;

    @Override
    public long getCounter() {
        return counter;
    }

    @Override
    public void setCounter(long counter) {
        this.counter = counter;
    }

}
