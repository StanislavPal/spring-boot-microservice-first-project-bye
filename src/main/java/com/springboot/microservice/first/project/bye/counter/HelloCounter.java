package com.springboot.microservice.first.project.bye.counter;

import javax.persistence.*;

@Entity
@Table(name = "hello_counter")
public class HelloCounter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "type")
    private CounterType type;

    @Column(name = "count_of")
    private long count;

    public HelloCounter() {
    }

    public HelloCounter(CounterType type, long count) {
        this.type = type;
        this.count = count;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public CounterType getType() {
        return type;
    }

    public void setType(CounterType type) {
        this.type = type;
    }

    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }
}
