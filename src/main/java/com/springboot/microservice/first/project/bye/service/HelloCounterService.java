package com.springboot.microservice.first.project.bye.service;

import com.springboot.microservice.first.project.bye.dao.HelloCounterDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class HelloCounterService {

    @Autowired
    @Qualifier(value = "helloCounterDaoJpaImpl")
    private HelloCounterDao counterDao;

    @Transactional
    public long getCounter() {
        return counterDao.getCounter();
    }

    @Transactional
    public void setCounter(long counter) {
        counterDao.setCounter(counter);
    }
}
