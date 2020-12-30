package com.springboot.microservice.first.project.bye.dao.inmemory;

import com.springboot.microservice.first.project.bye.dao.ByeCounterDao;
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
