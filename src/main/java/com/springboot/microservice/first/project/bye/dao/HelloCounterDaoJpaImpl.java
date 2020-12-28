package com.springboot.microservice.first.project.bye.dao;

import com.springboot.microservice.first.project.bye.counter.CounterType;
import com.springboot.microservice.first.project.bye.counter.HelloCounter;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Repository
@Primary
public class HelloCounterDaoJpaImpl implements HelloCounterDao {

    private final CounterType COUNTER_TYPE = CounterType.HELLO;

    @PersistenceContext
    private EntityManager em;

    @Override
    public long getCounter() {
        String sql = "SELECT count_of FROM hello_counter WHERE id = " +
                "(SELECT max(id) FROM hello_counter WHERE type = :type)";
        Query q = em.createNativeQuery(sql);
        q.setParameter("type", COUNTER_TYPE.ordinal() );
        return ( (Number) q.getSingleResult() ).longValue();
    }

    @Override
    public void setCounter(long count) {
        System.out.println(" ====== in jpa dao set count: " + count);
        em.persist( new HelloCounter(COUNTER_TYPE, count) );
    }

}
