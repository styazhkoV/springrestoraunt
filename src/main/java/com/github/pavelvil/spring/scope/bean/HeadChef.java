package com.github.pavelvil.spring.scope.bean;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(org.springframework.beans.factory.config.ConfigurableBeanFactory.SCOPE_SINGLETON)
public class HeadChef {
   private String headceafName;


   public void setHeadCeafName(String headceafName){
      this.headceafName = headceafName;
   }

   public String getHeadceafName(){
      return headceafName;
   }
   @Override
   public String toString() {
      return "HeadChef{" +
              "headceafName='" + headceafName + '\'' +
              '}';
   }

}
