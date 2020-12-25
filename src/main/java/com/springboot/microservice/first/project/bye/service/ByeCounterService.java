package com.springboot.microservice.first.project.bye.service;

import com.springboot.microservice.first.project.bye.counter.CounterType;
import com.springboot.microservice.first.project.bye.dao.ThisCounterDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.math.BigInteger;

@Service
public class ByeCounterService {
    private CounterType type = CounterType.bye;

    @Autowired
    @Qualifier(value = "thisCounterDaoImpl")
    private ThisCounterDao thisCounterDao;

    public BigInteger incrementCounter() {
        thisCounterDao.incrementCounter(type);
        return thisCounterDao.getCounter(type);
    }

    public BigInteger getCounter() {
        return thisCounterDao.getCounter(type);
    }
}
