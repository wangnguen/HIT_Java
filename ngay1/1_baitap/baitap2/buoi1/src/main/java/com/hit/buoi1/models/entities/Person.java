package com.hit.buoi1.models.entities;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.hit.buoi1.models.interfaces.Engine;
import com.hit.buoi1.models.interfaces.Vehicle;

@Component
public class Person {
  private Engine engine;
  private Vehicle vehicle;

  Person(@Qualifier("car") Vehicle vehicle, @Qualifier("gasolineEngine") Engine engine) {
    this.engine = engine;
    this.vehicle = vehicle;
  }

  public void use() {
    vehicle.drive();
    engine.get();
  }
}
