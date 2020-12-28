package com.springboot.microservice.first.project.bye.dao;

import com.springboot.microservice.first.project.bye.counter.Counter;
import com.springboot.microservice.first.project.bye.counter.CounterType;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Repository
@Primary
public class ByeCounterDaoJpaImpl implements ByeCounterDao {

    private final CounterType COUNTER_TYPE = CounterType.BYE;

    @PersistenceContext
    private EntityManager em;

    @Override
    @Transactional
    public long getCounter() {
        System.out.println("======= we are in jpa =======");
        String sql = "SELECT count(*) FROM counters WHERE type = :type";
        Query q = em.createNativeQuery(sql);
        q.setParameter("type", COUNTER_TYPE.ordinal() );
        return ( (Number) q.getSingleResult() ).longValue();
    }

    @Override
    @Transactional
    public void incrementCounter() {
        em.persist( new Counter(COUNTER_TYPE) );
    }
}
