package com.hit.buoi1.models.entities;

import org.springframework.stereotype.Component;

import com.hit.buoi1.models.interfaces.PaymentMethod;

@Component("paypalPayment")
public class PaypalPayment implements PaymentMethod {
  public void pay() {
    System.out.println("Thanh toan qua paypal");
  }
}
