package com.factorypattern.factory.impl;

import com.factorypattern.factory.Payment;

public class PayPalPayment implements Payment {

  @Override
  public void pay(double amount) {
    // TODO Auto-generated method stub
    System.out.println("paymentof Rs." + amount + " done through PayPal.");
  }

}
