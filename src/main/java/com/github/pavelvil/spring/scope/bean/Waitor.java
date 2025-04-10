package com.github.pavelvil.spring.scope.bean;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Waitor {


    private final UUID id;

    private String order;

    private int table;

    public Waitor(UUID id) {
        this.id = id;
    }


//    public Waitor(UUID id) {
//        this.id = id;
//    }

    public UUID getId() {
        return id;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public int getTable() {
        return table;
    }

    public void setTable(int table) {
        this.table = table;
    }

    @Override
    public String toString() {
        return "Waitor{" +
                "id=" + id +
                ", order='" + order + '\'' +
                ", table=" + table +
                '}';
    }
}
