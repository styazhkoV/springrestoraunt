package com.github.pavelvil.spring.di.config;

import com.github.pavelvil.spring.di.bean.Kitchen;
import com.github.pavelvil.spring.di.bean.Waitor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.github.pavelvil.spring.di")
public class CafeConfiguration {
    @Bean
    public Waitor waitor(Kitchen kitchen) {
        return new Waitor(kitchen);
    }
}
