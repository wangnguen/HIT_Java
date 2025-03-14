package com.hit.buoi1.models.entities;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.hit.buoi1.models.interfaces.Order;
import com.hit.buoi1.models.interfaces.PaymentMethod;

@Component
public class Customer {
  private Order order;
  private PaymentMethod paymentMethod;

  Customer(@Qualifier("fastFoodOrder") Order order, @Qualifier("paypalPayment") PaymentMethod paymentMethod) {
    this.order = order;
    this.paymentMethod = paymentMethod;
  }

  public void use() {
    order.placeOrder();
    paymentMethod.pay();
  }
}
