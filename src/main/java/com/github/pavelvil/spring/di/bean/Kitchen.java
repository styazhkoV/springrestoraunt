package com.github.pavelvil.spring.di.bean;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
public class Kitchen {
    public void cook(String order) {
        System.out.println("Kitchen cooked " + order);
    }
}
