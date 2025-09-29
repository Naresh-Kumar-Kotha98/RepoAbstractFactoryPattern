package com.factorypattern.factory.impl;

import com.factorypattern.factory.Payment;

public class CreditCardPayment implements Payment {

  @Override
  public void pay(double amount) {
    System.out.println("paymentof Rs." + amount + " done through credit card.");
  }

}
