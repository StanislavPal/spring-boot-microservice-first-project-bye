package com.springboot.microservice.first.project.bye.service;

import com.springboot.microservice.first.project.bye.dao.CounterDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class HelloCounterService {

    @Autowired
    @Qualifier(value = "helloCounterDaoInMemoryImpl")
    private CounterDao counterDao;

    public long incrementCounter() {
        counterDao.setCounter( counterDao.getCounter() + 1L );
        return counterDao.getCounter();
    }

    public long getCounter() {
        return counterDao.getCounter();
    }

    public void setCounter(long counter) {
        counterDao.setCounter(counter);
    }
}
