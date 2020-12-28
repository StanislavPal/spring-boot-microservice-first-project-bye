package com.springboot.microservice.first.project.bye.dao;

import org.springframework.stereotype.Repository;

@Repository
public class HelloCounterDaoInMemoryImpl implements HelloCounterDao {

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
