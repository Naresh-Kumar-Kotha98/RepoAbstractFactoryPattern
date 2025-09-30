package com.factorypattern.factory.impl;

import com.factorypattern.factory.Product;

public class IndianProduct implements Product {

  @Override
  public void describeProduct() {
    System.out.println("Product with Indian specifications and branding..");
  }

}
