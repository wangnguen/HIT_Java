package com.hit.buoi1.models.entities;

import org.springframework.stereotype.Component;

import com.hit.buoi1.models.interfaces.Order;

@Component("fastFoodOrder")
public class FastFoodOrder implements Order {
  public void placeOrder() {
    System.out.println("Dat mon an nhanh");
  }
}
