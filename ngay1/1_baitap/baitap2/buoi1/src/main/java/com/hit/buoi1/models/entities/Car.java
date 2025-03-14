package com.hit.buoi1.models.entities;

import org.springframework.stereotype.Component;

import com.hit.buoi1.models.interfaces.Vehicle;

@Component("car")
public class Car implements Vehicle {

  @Override
  public void drive() {
    System.out.println("drive by car");
  }
}
