package com.factorypattern.factory.impl;

import com.factorypattern.factory.Invoice;

public class IndianInvoice implements Invoice {

  @Override
  public void generate() {
    System.out.println("Invoice in Indian INR with GST details.");
  }

}
