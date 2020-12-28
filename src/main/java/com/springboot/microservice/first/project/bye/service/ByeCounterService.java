package com.springboot.microservice.first.project.bye.service;

import com.springboot.microservice.first.project.bye.dao.CounterDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class ByeCounterService {

    @Autowired
    @Qualifier(value = "byeCounterDaoInMemoryImpl")
    private CounterDao counterDao;

    public long incrementCounter() {
        counterDao.incrementCounter();
        return counterDao.getCounter();
    }

    public long getCounter() {
        return counterDao.getCounter();
    }
}
