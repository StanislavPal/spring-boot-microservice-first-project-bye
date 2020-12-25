package com.springboot.microservice.first.project.bye.service;

import com.springboot.microservice.first.project.bye.counter.CounterType;
import com.springboot.microservice.first.project.bye.dao.ForeignCounterDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.math.BigInteger;

@Service
public class HelloCounterService {

    private CounterType type = CounterType.hello;

    @Autowired
    @Qualifier(value = "foreignCounterDaoImpl")
    private ForeignCounterDao foreignCounterDao;

    public BigInteger getCounter() {
        return foreignCounterDao.getForeignCounter(type);
    }

    public void setCounter(long counter) {
        foreignCounterDao.setForeignCounter(type, counter);
    }
}
