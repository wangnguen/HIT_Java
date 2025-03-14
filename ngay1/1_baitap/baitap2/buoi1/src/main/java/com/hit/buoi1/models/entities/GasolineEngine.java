package com.hit.buoi1.models.entities;

import org.springframework.stereotype.Component;

import com.hit.buoi1.models.interfaces.Engine;

@Component("gasolineEngine")
public class GasolineEngine implements Engine {

  @Override
  public void get() {
    System.out.println("get by gasoline");
  }
}
