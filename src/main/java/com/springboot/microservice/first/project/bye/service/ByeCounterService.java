package com.springboot.microservice.first.project.bye.service;

import com.springboot.microservice.first.project.bye.dao.ByeCounterDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class ByeCounterService {

    @Autowired
    @Qualifier(value = "byeCounterDaoJpaImpl")
    private ByeCounterDao byeCounterDao;

    public void incrementCounter() {
        byeCounterDao.incrementCounter();
    }

    public long getCounter() {
        return byeCounterDao.getCounter();
    }
}
