package com.factorypattern.factory.impl;

import com.factorypattern.factory.Payment;

public class UpiPayment implements Payment {

  @Override
  public void pay(double amount) {
    // TODO Auto-generated method stub
    System.out.println("paymentof Rs." + amount + " done through UPI.");
  }

}
