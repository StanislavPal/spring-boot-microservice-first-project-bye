package com.springboot.microservice.first.project.bye.counter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "other_counters")
public class ForeignCounter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "type")
    private CounterType type;

    @Column(name = "count")
    private long count;

    @Column(insertable = false,
            columnDefinition = "DATETIME DEFAULT CURRENT_TIMESTAMP")
    private LocalDateTime created_at;

    public ForeignCounter() {
    }

    public ForeignCounter(CounterType type, long count) {
        this.type = type;
        this.count = count;
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

    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }

    public void setCreated_at(LocalDateTime created_at) {
        this.created_at = created_at;
    }
}
