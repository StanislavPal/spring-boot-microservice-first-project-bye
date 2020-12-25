package com.springboot.microservice.first.project.bye.dao;

import com.springboot.microservice.first.project.bye.counter.CounterType;

import java.math.BigInteger;

public interface ThisCounterDao {
    BigInteger getCounter(CounterType type);
    void incrementCounter(CounterType type);
}
