package com.hit.buoi1.models.entities;

import org.springframework.stereotype.Component;

@Component("creditCardPayment")
public class CreditCardPayment {
  public void pay() {
    System.out.println("Thanh toan bang the tin dung");
  }
}
