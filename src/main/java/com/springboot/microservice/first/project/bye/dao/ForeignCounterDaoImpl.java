package com.springboot.microservice.first.project.bye.dao;

import com.springboot.microservice.first.project.bye.counter.CounterType;
import com.springboot.microservice.first.project.bye.counter.ForeignCounter;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.math.BigInteger;

@Repository
public class ForeignCounterDaoImpl implements ForeignCounterDao {

    @PersistenceContext
    EntityManager em;

    @Override
    public BigInteger getForeignCounter(CounterType type) {
        Query q = em.createNativeQuery("SELECT count FROM foreign_counter WHERE id = (" +
                "SELECT MAX(id) FROM foreign_counters WHERE type = :type)");
        q.setParameter("type", type);
        return (BigInteger) q.getSingleResult();
    }

    @Override
    public void setForeignCounter(CounterType type, long count) {
        em.persist( new ForeignCounter(type, count) );
    }
}
