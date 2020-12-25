package com.springboot.microservice.first.project.bye.dao;

import com.springboot.microservice.first.project.bye.counter.CounterType;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;

@Repository
public class ThisCounterDaoInMemoryImpl implements ThisCounterDao {

    private BigInteger counter;

    @Override
    public BigInteger getCounter(CounterType type) {
        return counter;
    }

    @Override
    public void incrementCounter(CounterType type) {
        this.counter.add(BigInteger.ONE);
    }

}
