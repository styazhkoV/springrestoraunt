// package com.github.pavelvil.spring.di;

// import org.springframework.context.annotation.AnnotationConfigApplicationContext;
// import org.springframework.context.annotation.ComponentScan;
// import org.springframework.context.annotation.Configuration;

// import com.github.pavelvil.spring.di.bean.Customer;



// @Configuration
// @ComponentScan("com.github.pavelvil.spring.di")
// public class CafeApplication {
//     public static void main(String[] args) {
//         AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CafeApplication.class);
//         Customer customer = (Customer) context.getBean("customer", Customer.class);
//         customer.makeOrder("Selend and Pasta");
//     }
// }
