package com.factorypattern.factory.impl;

import com.factorypattern.factory.Invoice;

public class WesternInvoice implements Invoice {

  @Override
  public void generate() {
    System.out.println("Invoice in Western USD with VAT details.");
  }

}
