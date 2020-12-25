package com.springboot.microservice.first.project.bye.counter;

import javax.persistence.*;

@Entity
@Table(name = "this_counters")
public class ThisCounter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "type")
    private CounterType type;

    public ThisCounter() {
    }

    public ThisCounter(CounterType type) {
        this.type = type;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public CounterType getType() {
        return type;
    }

    public void setType(CounterType type) {
        this.type = type;
    }
}
