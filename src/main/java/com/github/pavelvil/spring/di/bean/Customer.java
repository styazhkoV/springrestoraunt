package com.github.pavelvil.spring.di.bean;

import org.springframework.stereotype.Component;

@Component
public class Customer {
    private final Waitor waitor;


    public Customer(Waitor waitor) {
        this.waitor = waitor;
    }

    public void makeOrder(String order) {
        System.out.println("Customer make order" + order);
        waitor.takeOrder(order);
    }
}
