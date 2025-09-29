package com.factorypattern.model;

public enum PaymentType {
  CREDITCARD("creditcard"), UPI("upi"), PAYPAL("paypal");

  private final String label;

  PaymentType(String label) {
      this.label = label;
  }

  public String getLabel() {
      return label;
  }

}
