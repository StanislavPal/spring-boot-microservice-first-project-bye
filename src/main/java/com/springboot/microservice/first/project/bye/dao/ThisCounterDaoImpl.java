package com.springboot.microservice.first.project.bye.dao;

import com.springboot.microservice.first.project.bye.counter.ThisCounter;
import com.springboot.microservice.first.project.bye.counter.CounterType;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.math.BigInteger;

@Repository
public class ThisCounterDaoImpl implements ThisCounterDao {

    @PersistenceContext
    EntityManager em;

    @Override
    public BigInteger getCounter(CounterType type) {
        Query q = em.createNativeQuery("SELECT count(*) FROM counters WHERE type = :type");
        q.setParameter("type", CounterType.hello.ordinal() );
        return (BigInteger) q.getSingleResult();
    }

    @Override
    public void incrementCounter(CounterType type) {
        em.persist( new ThisCounter(CounterType.hello) );
    }
}
