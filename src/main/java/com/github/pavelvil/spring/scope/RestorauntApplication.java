package com.github.pavelvil.spring.scope;

import com.github.pavelvil.spring.scope.bean.HeadChef;
import com.github.pavelvil.spring.scope.bean.ObjectProviderExample;
import com.github.pavelvil.spring.scope.bean.Waitor;
import org.springframework.context.ApplicationContext;

import com.github.pavelvil.spring.scope.config.RestorauntConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.UUID;


public class RestorauntApplication {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(RestorauntConfig.class);
//        HeadChef first = context.getBean(HeadChef.class);
//        HeadChef second = context.getBean(HeadChef.class);
//        first.setHeadCeafName("Alex");
//        second.setHeadCeafName("Vans");
//        System.out.println(first);
//        System.out.println(second);
//            Waitor firstWaiter = context.getBean(Waitor.class, UUID.randomUUID());
//            Waitor secondWaiter = context.getBean(Waitor.class, UUID.randomUUID());
//            firstWaiter.setOrder("Кофе");
//            secondWaiter.setOrder("Стейк");
//        System.out.println(firstWaiter);
//        System.out.println(secondWaiter);
        ObjectProviderExample objectProviderExample = context.getBean(ObjectProviderExample.class);
        objectProviderExample.getAndCompareHeadChef();
        objectProviderExample.getAndCompareWaitor();

    }
}
