package com.github.pavelvil.spring.scope.bean;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.stereotype.Component;

import java.util.UUID;
@Component
public class ObjectProviderExample {
    private final ObjectProvider<HeadChef> headChefObjectProvider;
    private final ObjectProvider<Waitor> waitorObjectProvider;

    public ObjectProviderExample(ObjectProvider<HeadChef> headChefObjectProvider, ObjectProvider<Waitor> waitorObjectProvider) {
        this.headChefObjectProvider = headChefObjectProvider;
        this.waitorObjectProvider = waitorObjectProvider;
    }
    public void getAndCompareHeadChef(){
        HeadChef first = headChefObjectProvider.getObject(UUID.randomUUID());
        HeadChef second = headChefObjectProvider.getObject(UUID.randomUUID());
        System.out.println(first == second);
    }
    public void getAndCompareWaitor(){
        Waitor first = waitorObjectProvider.getObject(UUID.randomUUID());
        Waitor second = waitorObjectProvider.getObject(UUID.randomUUID());
        System.out.println(first == second);
    }
}
