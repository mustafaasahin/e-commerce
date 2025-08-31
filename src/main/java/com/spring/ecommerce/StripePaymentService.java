package com.spring.ecommerce;


import org.springframework.stereotype.Service;

@Service
public class StripePaymentService implements PaymentService {

    public void processPayment(double amount) {
        System.out.println("Stripe");
        System.out.println("Processing payment of " + amount);
    }
}
