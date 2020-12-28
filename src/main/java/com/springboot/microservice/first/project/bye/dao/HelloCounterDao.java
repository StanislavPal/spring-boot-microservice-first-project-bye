package com.springboot.microservice.first.project.bye.dao;

import org.springframework.stereotype.Repository;

public interface HelloCounterDao {

    public long getCounter();

    public void setCounter(long count);
}
