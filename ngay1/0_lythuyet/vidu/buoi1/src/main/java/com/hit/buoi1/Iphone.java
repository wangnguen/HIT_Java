package com.hit.buoi1;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary // Ưu tiên sử dụng bean này khi có nhiều bean cùng loại
public class Iphone implements Phone {

  @Override
  public void call() {
    System.out.println("Goi dien bang Iphone");
  }
}
