package com.springboot.microservice.first.project.bye.dao;

import com.springboot.microservice.first.project.bye.counter.CounterType;

import java.math.BigInteger;

public interface ForeignCounterDao {
    BigInteger getForeignCounter(CounterType type);
    void setForeignCounter(CounterType type, long count);
}
