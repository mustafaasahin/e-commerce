package com.spring.ecommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class CommerceApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(CommerceApplication.class, args);
        var orderService = context.getBean(OrderService.class);
        orderService.placeOrder();
    }

}
